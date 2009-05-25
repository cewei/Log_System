INSERT INTO para_type (type_prefix, name, life_span, max_jump, repack_cycle) VALUES('ARC', 'ARC One', 1, 11, 111);
INSERT INTO para_type (type_prefix, name, life_span, max_jump, repack_cycle) VALUES('BRC', 'BRC One', 2, 22, 222);
INSERT INTO para_type (type_prefix, name, life_span, max_jump, repack_cycle) VALUES('CRC', 'CRC One', 3, 33, 333);
INSERT INTO para_type (type_prefix, name, life_span, max_jump, repack_cycle) VALUES('DRC', 'DRC One', 4, 44, 444);

INSERT INTO parachute_system.para_inventory (type_prefix_no, chute_no, serial_no, date_of_mfg, no_of_jumps, status) VALUES(1, 'A', 'A1', '2009-04-12 00:00:00.0', 0, '');
INSERT INTO parachute_system.para_inventory (type_prefix_no, chute_no, serial_no, date_of_mfg, no_of_jumps, status) VALUES(2, 'B', 'B2', '2009-04-12 00:00:00.0', 0, '');
INSERT INTO parachute_system.para_inventory (type_prefix_no, chute_no, serial_no, date_of_mfg, no_of_jumps, status) VALUES(3, 'C', 'C3', '2009-04-12 00:00:00.0', 0, '');
INSERT INTO parachute_system.para_inventory (type_prefix_no, chute_no, serial_no, date_of_mfg, no_of_jumps, status) VALUES(4, 'D', 'D4', '2009-04-12 00:00:00.0', 0, '');

INSERT INTO para_packing (type_prefix_no, chute_no, serial_no, date_packed, pack_by, inspect_by, check_type) VALUES (1, 'A', 'A1', '2009-04-12 00:00:00.0', 'packed', 'inspected', 'repacking');