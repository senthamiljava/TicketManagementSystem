CREATE TABLE ticket_status(id INT PRIMARY KEY AUTO_INCREMENT,
NAME VARCHAR(50) NOT NULL,code varchar(20) not null,is_active int default 1,unique key(code));

INSERT INTO ticket_status(NAME,code) VALUES
('open','S001'),
('In progress','S002'),
('Resolved','S003'),
('Closed','S004');