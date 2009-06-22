INSERT INTO para_type (type_prefix, name, life_span, max_jump, repack_cycle) VALUES('ARC', 'ARC One', 1, 11, 90);
INSERT INTO para_type (type_prefix, name, life_span, max_jump, repack_cycle) VALUES('BRC', 'BRC One', 2, 22, 90);
INSERT INTO para_type (type_prefix, name, life_span, max_jump, repack_cycle) VALUES('CRC', 'CRC One', 3, 33, 90);
INSERT INTO para_type (type_prefix, name, life_span, max_jump, repack_cycle) VALUES('DRC', 'DRC One', 4, 44, 90);

INSERT INTO para_inventory (type_prefix_no, chute_no, serial_no, date_of_mfg, no_of_jumps, status) VALUES(1, '0001', '1000', '2009-04-12', 0, 'serviceable');
INSERT INTO para_inventory (type_prefix_no, chute_no, serial_no, date_of_mfg, no_of_jumps, status) VALUES(1, '0002', '1001', '2009-04-12', 0, 'servicing');
INSERT INTO para_inventory (type_prefix_no, chute_no, serial_no, date_of_mfg, no_of_jumps, status) VALUES(2, '0001', '2000', '2009-04-12', 0, 'serviceable');
INSERT INTO para_inventory (type_prefix_no, chute_no, serial_no, date_of_mfg, no_of_jumps, status) VALUES(3, '0001', '3000', '2009-04-12', 0, 'loan');
INSERT INTO para_inventory (type_prefix_no, chute_no, serial_no, date_of_mfg, no_of_jumps, status) VALUES(4, '0001', '4000', '2009-04-12', 0, 'servicing');

INSERT INTO para_riggers (NRIC, name, rank, rigger, inspector) VALUES ('S1234567A', 'Riggger A', '3SG', 1, 0);
INSERT INTO para_riggers (NRIC, name, rank, rigger, inspector) VALUES ('S2345678B', 'Inspector A', '3SG', 0, 1);
INSERT INTO para_riggers (NRIC, name, rank, rigger, inspector) VALUES ('S3456789C', 'Rigger B', '1SG', 1, 0);
INSERT INTO para_riggers (NRIC, name, rank, rigger, inspector) VALUES ('S4567890D', 'Inspector B', '1SG', 0, 1);
INSERT INTO para_riggers (NRIC, name, rank, rigger, inspector) VALUES ('S5678901E', 'Rigger & Inspector C', 'MWO', 1, 1);

INSERT INTO para_borrowers (NRIC, name, rank, unit) VALUES ('S8470182C', 'Chris', '3SG', 'BMTC');
INSERT INTO para_borrowers (NRIC, name, rank, unit) VALUES ('S8770182C', 'Lancer', 'SSG', 'HQ CDO');

INSERT INTO para_loan (NRIC, type_prefix_no, chute_no, serial_no, date_out) VALUES ('S8470182C', 3, '0001', '3000', '2009-06-06');

INSERT INTO para_packing (type_prefix_no, chute_no, serial_no, date_packed, pack_by, inspect_by, check_type) VALUES (1, '0001', '1000', '2009-04-12', 'S1234567A', 'S2345678B', 'inspection');
INSERT INTO para_packing (type_prefix_no, chute_no, serial_no, date_packed, pack_by, inspect_by, check_type) VALUES (1, '0001', '1000', '2009-10-15', 'S3456789C', 'S4567890D', 'repacking');
INSERT INTO para_packing (type_prefix_no, chute_no, serial_no, date_packed, pack_by, inspect_by, check_type) VALUES (1, '0002', '1001', '2009-04-12', 'S1234567A', 'S2345678B', 'inspection');
INSERT INTO para_packing (type_prefix_no, chute_no, serial_no, date_packed, pack_by, inspect_by, check_type) VALUES (2, '0001', '2000', '2009-04-12', 'S3456789C', 'S4567890D', 'inspection');
INSERT INTO para_packing (type_prefix_no, chute_no, serial_no, date_packed, pack_by, inspect_by, check_type) VALUES (3, '0001', '3000', '2009-04-12', 'S1234567A', 'S2345678B', 'inspection');
INSERT INTO para_packing (type_prefix_no, chute_no, serial_no, date_packed, pack_by, inspect_by, check_type) VALUES (4, '0001', '4000', '2009-04-12', 'S3456789C', 'S4567890D', 'inspection');