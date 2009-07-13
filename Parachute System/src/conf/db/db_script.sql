DROP VIEW IF EXISTS `parachute_system`.`para_loan_view`;

DROP VIEW IF EXISTS `parachute_system`.`para_overview`;

DROP VIEW IF EXISTS `parachute_system`.`para_packing_view`;

DROP VIEW IF EXISTS `parachute_system`.`para_packing_latest_view`;

DROP VIEW IF EXISTS `parachute_system`.`para_inventory_view`;

DROP TABLE IF EXISTS `parachute_system`.`para_packing`;

DROP TABLE IF EXISTS `parachute_system`.`para_loan`;

DROP TABLE IF EXISTS `parachute_system`.`para_riggers`;

DROP TABLE IF EXISTS `parachute_system`.`para_borrowers`;

DROP TABLE IF EXISTS `parachute_system`.`para_inventory`;

DROP TABLE IF EXISTS `parachute_system`.`para_type`;

CREATE TABLE  `parachute_system`.`para_type` (
  `para_type_no` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type_prefix` varchar(45) NOT NULL,
  `name` varchar(45) NOT NULL,
  `life_span` int(10) unsigned NOT NULL,
  `max_jump` int(10) unsigned NOT NULL,
  `repack_cycle` int(10) unsigned NOT NULL,
  `reserve` tinyint(1) NOT NULL,
  PRIMARY KEY (`para_type_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE  `parachute_system`.`para_inventory` (
  `type_prefix_no` int(10) unsigned NOT NULL,
  `chute_no` varchar(45) NOT NULL,
  `serial_no` varchar(45) NOT NULL,
  `date_of_mfg` date NOT NULL,
  `no_of_jumps` int(10) unsigned NOT NULL,
  `status` enum('serviceable','servicing', 'loan', 'returned') NOT NULL,
  PRIMARY KEY (`type_prefix_no`,`chute_no`,`serial_no`),
  CONSTRAINT `FK_para_inventory_type` FOREIGN KEY (`type_prefix_no`) REFERENCES `para_type` (`para_type_no`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE  `parachute_system`.`para_borrowers` (
  `NRIC` varchar(45) NOT NULL,
  `name` varchar(45) NOT NULL,
  `rank` varchar(45) NOT NULL,
  `unit` varchar(45) NOT NULL,
  PRIMARY KEY (`NRIC`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE  `parachute_system`.`para_riggers` (
  `NRIC` varchar(45) NOT NULL,
  `name` varchar(45) NOT NULL,
  `rank` varchar(45) NOT NULL,
  `rigger` tinyint(1) NOT NULL,
  `inspector` tinyint(1) NOT NULL,
  `last_refresher_date` date NOT NULL,
  PRIMARY KEY (`NRIC`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE  `parachute_system`.`para_loan` (
  `para_loan_no` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `NRIC` varchar(45) NOT NULL,
  `type_prefix_no` int(10) unsigned NOT NULL,
  `chute_no` varchar(45) NOT NULL,
  `serial_no` varchar(45) NOT NULL,
  `date_out` date NOT NULL,
  `date_in` date DEFAULT NULL,
  PRIMARY KEY (`para_loan_no`),
  KEY `FK_para_loan_NRIC` (`NRIC`),
  KEY `FK_para_loan_inventory_no` (`type_prefix_no`,`chute_no`,`serial_no`),
  CONSTRAINT `FK_para_loan_NRIC` FOREIGN KEY (`NRIC`) REFERENCES `para_borrowers` (`NRIC`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_para_loan_inventory_no` FOREIGN KEY (`type_prefix_no`, `chute_no`, `serial_no`) REFERENCES `para_inventory` (`type_prefix_no`, `chute_no`, `serial_no`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE  `parachute_system`.`para_packing` (
  `para_packing_no` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type_prefix_no` int(10) unsigned NOT NULL,
  `chute_no` varchar(45) NOT NULL,
  `serial_no` varchar(45) NOT NULL,
  `date_packed` date NOT NULL,
  `pack_by` varchar(45) NOT NULL,
  `inspect_by` varchar(45) NOT NULL,
  `check_type` enum('repacking','inspection') NOT NULL,
  PRIMARY KEY (`para_packing_no`),
  KEY `FK_para_packing_inventory_no` (`type_prefix_no`,`chute_no`,`serial_no`),
  KEY `FK_para_packing_pack_by` (`pack_by`),
  KEY `FK_para_packing_inspect_by` (`inspect_by`),
  CONSTRAINT `FK_para_packing_inspect_by` FOREIGN KEY (`inspect_by`) REFERENCES `para_riggers` (`NRIC`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_para_packing_inventory_no` FOREIGN KEY (`type_prefix_no`, `chute_no`, `serial_no`) REFERENCES `para_inventory` (`type_prefix_no`, `chute_no`, `serial_no`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_para_packing_pack_by` FOREIGN KEY (`pack_by`) REFERENCES `para_riggers` (`NRIC`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE VIEW `parachute_system`.`para_inventory_view` AS
SELECT
para_inventory.type_prefix_no AS `Type Prefix No`,
para_inventory.serial_no AS `Serial No`,
para_type.name AS `Name`,
CONCAT_WS('-', para_type.type_prefix, para_inventory.chute_no) AS `Chute No`,
para_type.life_span AS `Life Span`,
para_type.max_jump AS `Max Jumps`,
para_type.max_jump-para_inventory.no_of_jumps AS `Jumps Left`,
para_inventory.date_of_mfg AS `Manufactured Date`,
para_inventory.date_of_mfg + INTERVAL para_type.life_span YEAR AS `Replacement Date`,
para_inventory.status AS `Current Status`
FROM para_inventory
INNER JOIN para_type
ON para_inventory.type_prefix_no=para_type.para_type_no;

CREATE VIEW `parachute_system`.`para_packing_latest_view` AS
SELECT * FROM para_packing AS p1
WHERE date_packed =
(SELECT MAX(date_packed) FROM para_packing AS p2
WHERE p1.type_prefix_no=p2.type_prefix_no AND p1.chute_no=p2.chute_no AND p1.serial_no=p2.serial_no
GROUP by type_prefix_no,chute_no,serial_no);

CREATE VIEW `parachute_system`.`para_packing_view` AS
SELECT
para_inventory.serial_no AS `Serial No`,
CONCAT_WS('-', para_type.type_prefix, para_inventory.chute_no) AS `Chute No`,
para_packing.date_packed AS `Repacked Date`,
para_packing.date_packed +INTERVAL para_type.repack_cycle DAY AS `Repack Due Date`,
para_packing.pack_by AS `Pack By`,
para_packing.inspect_by AS `Inspect By`,
para_packing.check_type AS `Check Type`,
para_inventory.status AS `Status`,
para_type.para_type_no,
para_inventory.chute_no
FROM para_inventory
INNER JOIN para_type
ON para_inventory.type_prefix_no=para_type.para_type_no
LEFT JOIN para_packing_latest_view AS para_packing
ON para_inventory.type_prefix_no=para_packing.type_prefix_no AND
para_inventory.chute_no=para_packing.chute_no AND
para_inventory.serial_no=para_packing.serial_no
ORDER BY `Repack Due Date`;

CREATE VIEW `parachute_system`.`para_overview` AS
SELECT
para_inventory.serial_no AS `Serial No`,
para_type.name AS `Name`,
CONCAT_WS('-', para_type.type_prefix, para_inventory.chute_no) AS `Chute No`,
para_type.life_span AS `Life Span`,
para_type.max_jump AS `Max Jumps`,
para_type.max_jump-para_inventory.no_of_jumps AS `Jumps Left`,
para_inventory.date_of_mfg AS `Manufactured Date`,
para_inventory.date_of_mfg + INTERVAL para_type.life_span YEAR AS `Replacement Date`,
para_packing.date_packed AS `Repacked Date`,
para_packing.date_packed +INTERVAL para_type.repack_cycle DAY AS `Repack Due Date`,
para_packing.pack_by AS `Pack By`,
para_packing.inspect_by AS `Inspect By`,
para_inventory.status AS `Current Status`
FROM para_inventory
INNER JOIN para_type
ON para_inventory.type_prefix_no=para_type.para_type_no
LEFT JOIN para_packing_latest_view AS para_packing
ON para_inventory.type_prefix_no=para_packing.type_prefix_no AND
para_inventory.chute_no=para_packing.chute_no AND
para_inventory.serial_no=para_packing.serial_no;

CREATE VIEW `parachute_system`.`para_loan_view` AS
SELECT
para_borrowers.NRIC AS `NRIC`,
para_borrowers.rank AS `Rank`,
para_borrowers.name AS `Borrower`,
para_borrowers.unit AS `Unit`,
para_loan.serial_no AS `Serial No`,
para_type.name AS `Name`,
CONCAT_WS('-', para_type.type_prefix, para_loan.chute_no) AS `Chute No`,
para_loan.date_out AS `Date Out`,
para_loan.date_in AS `Date In`
FROM para_loan
INNER JOIN para_type
ON para_loan.type_prefix_no = para_type.para_type_no
INNER JOIN para_borrowers
ON para_borrowers.nric = para_loan.nric;