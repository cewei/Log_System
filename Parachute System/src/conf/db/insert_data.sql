INSERT INTO para_type (type_prefix, name, life_span, max_jump, repack_cycle, reserve, static) VALUES
('MA', 'MACH III ALPHA MAIN 325', 10, 100, 90, 0, 0),
('MAR', 'MACH III ALPHA RESERVE 325 (MAR)', 10, 100, 90, 1, 0),
('MC5', 'MC5 MAIN 370', 10, 100, 90, 0, 1),
('MCR', 'MC-5 RESERVE 370 (MCR)', 10, 100, 90, 1, 1);

INSERT INTO para_inventory (type_prefix_no, chute_no, serial_no, date_of_mfg, no_of_jumps, status) VALUES
(1, '1', '975170002', '1997-06-01', 0, 'serviceable'),
(1, '2', '975170003', '1997-06-01', 0, 'servicing'),
(1, '3', '975170004', '1997-06-01', 0, 'serviceable'),
(2, '1', 'R00563', '1997-06-01', 0, 'serviceable'),
(2, '2', 'R00564', '1997-06-01', 0, 'serviceable'),
(2, '3', 'R00565', '1997-06-01', 0, 'serviceable'),
(3, '11', 'SL 21500X', '1997-06-01', 0, 'loan'),
(3, '12', 'SL 21562X', '1997-06-01', 0, 'serviceable'),
(3, '13', 'SL 21502X', '1997-06-01', 0, 'serviceable'),
(4, '11', 'SL 21561X', '1997-06-01', 0, 'servicing'),
(4, '12', 'SLX 33729', '2006-01-01', 0, 'serviceable'),
(4, '13', 'SL 21563X', '1997-06-01', 0, 'Serviceable');

INSERT INTO para_riggers (NRIC, name, rank, rigger, inspector, last_refresher_date) VALUES
('S1234567A', 'Riggger A', '3SG', 1, 0, '2009-01-01'),
('S2345678B', 'Inspector A', '3SG', 0, 1, '2009-01-01'),
('S3456789C', 'Rigger B', '1SG', 1, 0, '2009-01-01'),
('S4567890D', 'Inspector B', '1SG', 0, 1, '2009-01-01'),
('S5678901E', 'Rigger & Inspector C', 'MWO', 1, 1, '2009-01-01');

INSERT INTO para_borrowers (NRIC, name, rank, unit) VALUES
('S8470182C', 'Chris', '3SG', 'BMTC'),
('S8770182C', 'Lancer', 'SSG', 'HQ CDO');

INSERT INTO para_loan (NRIC, type_prefix_no, chute_no, serial_no, date_out) VALUES
('S8470182C', 3, '11', 'SL 21500X', '1997-06-01');

INSERT INTO para_packing (type_prefix_no, chute_no, serial_no, date_packed, pack_by, inspect_by, check_type) VALUES
(1, '1', '975170002', '1997-01-01', 'S1234567A', 'S2345678B', 'inspection'),
(1, '1', '975170002', '1997-01-01', 'S3456789C', 'S4567890D', 'repacking'),
(1, '2', '975170003', '1997-01-01', 'S1234567A', 'S2345678B', 'inspection'),
(2, '1', 'R00563', '1997-06-01', 'S3456789C', 'S4567890D', 'inspection'),
(3, '11', 'SL 21500X', '1997-06-01', 'S1234567A', 'S2345678B', 'inspection'),
(4, '11', 'SL 21561X', '1997-06-01', 'S3456789C', 'S4567890D', 'inspection');