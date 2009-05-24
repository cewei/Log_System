CREATE VIEW `parachute_system`.`para_overview` AS
SELECT para_type.type_prefix, para_inventory.chute_no, para_inventory.serial_no, para_inventory.date_of_mfg
FROM para_inventory
INNER JOIN para_type
ON para_inventory.type_prefix_no=para_type.para_type_no;