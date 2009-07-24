INSERT INTO para_type (type_prefix, name, life_span, max_jump, repack_cycle, reserve, static) VALUES
('MA', 'MACH III ALPHA MAIN 325', 10, 100, 90, 0, 0),
('MAR', 'MACH III ALPHA RESERVE 325', 10, 100, 90, 1, 0),
('MC5', 'MC5 MAIN 370', 10, 100, 90, 0, 1),
('MCR', 'MC-5 RESERVE 370', 10, 100, 90, 1, 1),
('PD', 'PERFORMANCE DESIGN MAIN', 10, 100, 90, 0, 0),
('PDR', 'PERFORMANCE DESIGN RESERVE 176 (PDR)', 10, 100, 90, 1, 0),
('TP', 'TANDEM PHOENIX', 10, 100, 90, 0, 1),
('HR', 'HEAVY RESERVE', 10, 100, 90, 1, 1),
('CLASS', 'CLASSIC MAIN', 10, 100, 90, 0, 0),
('PDR(C)', 'PERFORMANCE DESIGN RESERVE 176 (PDR(C))', 10, 100, 90, 1, 0),
('TL', 'TRIATHLON MAIN 190', 10, 100, 90, 0, 1),
('SR', 'SMART RESERVE 175' , 10, 100, 90, 1, 1);

INSERT INTO para_inventory (type_prefix_no, chute_no, serial_no, date_of_mfg, no_of_jumps, status) VALUES
(1, '1', '975170002', '1997-06-01', 0, 'loan'),
(1, '2', '975170003', '1997-06-01', 0, 'unpacked'),
(1, '3', '975170004', '1997-06-01', 0, 'packed'),
(2, '1', 'R00563', '1997-06-01', 0, 'loan'),
(2, '2', 'R00564', '1997-06-01', 0, 'unpacked'),
(2, '3', 'R00565', '1997-06-01', 0, 'packed'),
(3, '11', 'SL 21500X', '1997-06-01', 0, 'loan'),
(3, '12', 'SL 21562X', '1997-06-01', 0, 'unpacked'),
(3, '13', 'SL 21502X', '1997-06-01', 0, 'packed'),
(4, '11', 'SL 21561X', '1997-06-01', 0, 'loan'),
(4, '12', 'SLX 33729', '2006-01-01', 0, 'unpacked'),
(4, '13', 'SL 21563X', '1997-06-01', 0, 'packed'),
(5, '01', 'PD 190 019878', '2000-12-01', 0, 'inspection'),
(5, '02', 'PD 190 019879', '2000-12-01', 0, 'repair'),
(5, '03', 'PD 190 019880', '2000-12-01', 0, 'unserviceable'),
(5, '20', 'PD 2100 19897', '2000-12-01', 0, 'others'),
(5, '21', 'PD 2100 19898', '2000-12-01', 0, 'returned'),
(5, '22', 'PD 2100 19899', '2000-12-01', 0, 'loan'),
(6, '01', 'PR 176 023535', '2000-12-01', 0, 'inspection'),
(6, '02', 'PR 176 023536', '2000-12-01', 0, 'repair'),
(6, '03', 'PR 176 023537', '2000-12-01', 0, 'unserviceable'),
(6, '20', 'PR 176 023554', '2000-12-01', 0, 'others'),
(6, '21', 'PR 176 023555', '2000-12-01', 0, 'returned'),
(6, '22', 'PR 176 023556', '2000-12-01', 0, 'loan'),
(7, '01', 'TP 360 0000 68', '2005-02-01', 0, 'inspection'),
(7, '02', 'TP 360 0000 69', '2005-02-01', 0, 'repair'),
(7, '03', 'TP 360 0000 70', '2005-02-01', 0, 'unserviceable'),
(7, '06', 'TP 400 0000 39', '2004-10-01', 0, 'others'),
(7, '07', 'TP 400 0000 66', '2004-10-01', 0, 'returned'),
(7, '08', 'TP 400 0000 41', '2004-10-01', 0, 'loan'),
(8, '01', 'HR 360 0000 51', '2004-10-01', 0, 'inspection'),
(8, '02', 'HR 360 0000 52', '2004-10-01', 0, 'repair'),
(8, '03', 'HR 360 0000 53', '2004-10-01', 0, 'unserviceable'),
(8, '06', 'HR 400 0000 21', '2004-06-01', 0, 'others'),
(8, '07', 'HR 400 0000 22', '2004-06-01', 0, 'returned'),
(8, '08', 'HR 400 0000 23', '2004-06-01', 0, 'loan'),
(9, '01', '259 0988 0206', '2006-02-01', 0, 'unpacked'),
(9, '02', '259 0989 0206', '2006-02-01', 0, 'packed'),
(9, '03', '259 0990 0206', '2006-02-01', 0, 'inspection'),
(9, '06', '259 0993 0206', '2006-02-01', 0, 'repair'),
(9, '07', '259 0994 0206', '2006-02-01', 0, 'unserviceable'),
(9, '08', '259 0995 0206', '2006-02-01', 0, 'others'),
(10, '01', 'PR 176 037097', '2006-04-01', 0, 'unpacked'),
(10, '02', 'PR 176 037098', '2006-04-01', 0, 'packed'),
(10, '03', 'PR 176 037099', '2006-04-01', 0, 'inspection'),
(10, '06', 'PR 176 037102', '2006-04-01', 0, 'repair'),
(10, '07', 'PR 176 037103', '2006-04-01', 0, 'unserviceable'),
(10, '08', 'PR 176 037104', '2006-04-01', 0, 'others'),
(11, '01', '266102', '2006-03-01', 0, 'unpacked'),
(11, '02', '266103', '2006-03-01', 0, 'packed'),
(11, '03', '266104', '2006-03-01', 0, 'inspection'),
(12, '01', '266092', '2006-03-01', 0, 'unpacked'),
(12, '02', '266093', '2006-03-01', 0, 'packed'),
(12, '03', '266094', '2006-03-01', 0, 'inspection');

INSERT INTO para_riggers (NRIC, name, rank, rigger, inspector, last_refresher_date) VALUES
('S1234567A', 'Riggger A', '3SG', 1, 0, '2009-01-01'),
('S2345678B', 'Inspector A', '3SG', 0, 1, '2009-01-01'),
('S3456789C', 'Rigger B', '1SG', 1, 0, '2009-01-01'),
('S4567890D', 'Inspector B', '1SG', 0, 1, '2009-01-01'),
('S5678901E', 'Rigger & Inspector C', 'MWO', 1, 1, '2009-01-01');

INSERT INTO para_borrowers (NRIC, name, rank, unit) VALUES
('S8470182C', 'Chris', '3SG', 'BMTC'),
('S8770182C', 'Lancer', 'SSG', 'HQ CDO');

--INSERT INTO para_loan (NRIC, type_prefix_no, chute_no, serial_no, date_out) VALUES
--('S8470182C', 3, '11', 'SL 21500X', '1997-06-01');

INSERT INTO para_packing (type_prefix_no, chute_no, serial_no, date_packed, pack_by, inspect_by, check_type) VALUES
(1, '1', '975170002', '1997-01-01', 'S1234567A', 'S2345678B', 'inspection'),
(1, '1', '975170002', '1997-01-01', 'S3456789C', 'S4567890D', 'repacking'),
(1, '2', '975170003', '1997-01-01', 'S1234567A', 'S2345678B', 'inspection'),
(2, '1', 'R00563', '1997-06-01', 'S3456789C', 'S4567890D', 'inspection'),
(3, '11', 'SL 21500X', '1997-06-01', 'S1234567A', 'S2345678B', 'inspection'),
(4, '11', 'SL 21561X', '1997-06-01', 'S3456789C', 'S4567890D', 'inspection');