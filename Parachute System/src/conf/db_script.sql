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
  `date_of_mfg` datetime NOT NULL,
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
  `date_out` datetime NOT NULL,
  `date_in` datetime NOT NULL,
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
  `date_packed` datetime NOT NULL,
  `pack_by` varchar(45) NOT NULL,
  `inspect_by` varchar(45) NOT NULL,
  `check_type` enum('repacking','inspection') NOT NULL,
  PRIMARY KEY (`para_packing_no`),
  KEY `FK_para_packing_inventory_no` (`type_prefix_no`,`chute_no`,`serial_no`),
  CONSTRAINT `FK_para_packing_inventory_no` FOREIGN KEY (`type_prefix_no`, `chute_no`, `serial_no`) REFERENCES `para_inventory` (`type_prefix_no`, `chute_no`, `serial_no`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;