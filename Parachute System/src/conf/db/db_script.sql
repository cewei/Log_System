DROP VIEW IF EXISTS `parachute_system`.`para_overview_packing`;

DROP VIEW IF EXISTS `parachute_system`.`para_packing_view`;

DROP VIEW IF EXISTS `parachute_system`.`para_overview`;

DROP TABLE IF EXISTS `parachute_system`.`para_packing`;

DROP TABLE IF EXISTS `parachute_system`.`para_loan`;

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
  PRIMARY KEY (`para_type_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE  `parachute_system`.`para_inventory` (
  `type_prefix_no` int(10) unsigned NOT NULL,
  `chute_no` varchar(45) NOT NULL,
  `serial_no` varchar(45) NOT NULL,
  `date_of_mfg` date NOT NULL,
  `no_of_jumps` int(10) unsigned NOT NULL,
  `status` varchar(45) NOT NULL,
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

CREATE TABLE  `parachute_system`.`para_loan` (
  `para_loan_no` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `NRIC` varchar(45) NOT NULL,
  `type_prefix_no` int(10) unsigned NOT NULL,
  `chute_no` varchar(45) NOT NULL,
  `serial_no` varchar(45) NOT NULL,
  `date_out` date NOT NULL,
  `date_in` date NOT NULL,
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
  CONSTRAINT `FK_para_packing_inventory_no` FOREIGN KEY (`type_prefix_no`, `chute_no`, `serial_no`) REFERENCES `para_inventory` (`type_prefix_no`, `chute_no`, `serial_no`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE VIEW `parachute_system`.`para_overview` AS
SELECT
para_inventory.serial_no,
para_type.name,
CONCAT_WS('-', para_type.type_prefix, para_inventory.chute_no) AS para_serial,
para_type.life_span,
para_type.max_jump,
para_type.max_jump-para_inventory.no_of_jumps AS para_jumps_left,
para_inventory.date_of_mfg,
para_inventory.date_of_mfg + INTERVAL para_type.life_span YEAR AS `Replacement Date`
FROM para_inventory
INNER JOIN para_type
ON para_inventory.type_prefix_no=para_type.para_type_no;

CREATE VIEW `parachute_system`.`para_packing_view` AS
SELECT * FROM para_packing as p1
where date_packed =
(SELECT MAX(date_packed) FROM para_packing as p2
where p1.type_prefix_no=p2.type_prefix_no AND p1.chute_no=p2.chute_no AND p1.serial_no=p2.serial_no
GROUP by type_prefix_no,chute_no,serial_no);

CREATE VIEW `parachute_system`.`para_overview_packing` AS
SELECT
para_inventory.serial_no,
para_type.name,
CONCAT_WS('-', para_type.type_prefix, para_inventory.chute_no) AS para_serial,
para_type.life_span,
para_type.max_jump,
para_type.max_jump-para_inventory.no_of_jumps AS para_jumps_left,
para_inventory.date_of_mfg,
para_inventory.date_of_mfg + INTERVAL para_type.life_span YEAR AS `Replacement Date`,
para_packing.date_packed,
para_packing.pack_by,
para_packing.inspect_by,
para_packing.check_type
FROM para_inventory
INNER JOIN para_type
ON para_inventory.type_prefix_no=para_type.para_type_no
LEFT JOIN para_packing_view AS para_packing
ON para_inventory.type_prefix_no=para_packing.type_prefix_no AND
para_inventory.chute_no=para_packing.chute_no AND
para_inventory.serial_no=para_packing.serial_no;