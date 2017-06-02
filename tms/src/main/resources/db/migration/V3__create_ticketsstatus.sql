CREATE TABLE ticket_status(id INT PRIMARY KEY AUTO_INCREMENT,
NAME VARCHAR(50) NOT NULL,is_active int default 1);

INSERT INTO ticket_status(NAME) VALUES
('open'),
('In progress'),
('Resolved'),
('Closed');