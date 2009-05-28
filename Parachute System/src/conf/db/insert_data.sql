INSERT INTO para_type (type_prefix, name, life_span, max_jump, repack_cycle) VALUES('ARC', 'ARC One', 1, 11, 90);
INSERT INTO para_type (type_prefix, name, life_span, max_jump, repack_cycle) VALUES('BRC', 'BRC One', 2, 22, 90);
INSERT INTO para_type (type_prefix, name, life_span, max_jump, repack_cycle) VALUES('CRC', 'CRC One', 3, 33, 90);
INSERT INTO para_type (type_prefix, name, life_span, max_jump, repack_cycle) VALUES('DRC', 'DRC One', 4, 44, 90);

INSERT INTO para_inventory (type_prefix_no, chute_no, serial_no, date_of_mfg, no_of_jumps, status) VALUES(1, '0001', '1000', '2009-04-12', 0, 'serviceable');
INSERT INTO para_inventory (type_prefix_no, chute_no, serial_no, date_of_mfg, no_of_jumps, status) VALUES(1, '0002', '1001', '2009-04-12', 0, 'servicing');
INSERT INTO para_inventory (type_prefix_no, chute_no, serial_no, date_of_mfg, no_of_jumps, status) VALUES(2, '0001', '2000', '2009-04-12', 0, 'serviceable');
INSERT INTO para_inventory (type_prefix_no, chute_no, serial_no, date_of_mfg, no_of_jumps, status) VALUES(3, '0001', '3000', '2009-04-12', 0, 'loan');
INSERT INTO para_inventory (type_prefix_no, chute_no, serial_no, date_of_mfg, no_of_jumps, status) VALUES(4, '0001', '4000', '2009-04-12', 0, 'servicing');

INSERT INTO para_packing (type_prefix_no, chute_no, serial_no, date_packed, pack_by, inspect_by, check_type) VALUES (1, '0001', '1000', '2009-04-12', 'packer1', 'inspector1', 'inspection');
INSERT INTO para_packing (type_prefix_no, chute_no, serial_no, date_packed, pack_by, inspect_by, check_type) VALUES (1, '0001', '1000', '2009-10-15', 'packer2', 'inspector2', 'repacking');
INSERT INTO para_packing (type_prefix_no, chute_no, serial_no, date_packed, pack_by, inspect_by, check_type) VALUES (1, '0002', '1001', '2009-04-12', 'packer3', 'inspector3', 'inspection');
INSERT INTO para_packing (type_prefix_no, chute_no, serial_no, date_packed, pack_by, inspect_by, check_type) VALUES (2, '0001', '2000', '2009-04-12', 'packer4', 'inspector4', 'inspection');
INSERT INTO para_packing (type_prefix_no, chute_no, serial_no, date_packed, pack_by, inspect_by, check_type) VALUES (3, '0001', '3000', '2009-04-12', 'packer5', 'inspector5', 'inspection');
INSERT INTO para_packing (type_prefix_no, chute_no, serial_no, date_packed, pack_by, inspect_by, check_type) VALUES (4, '0001', '4000', '2009-04-12', 'packer6', 'inspector6', 'inspection');