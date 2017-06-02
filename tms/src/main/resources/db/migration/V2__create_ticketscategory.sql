CREATE TABLE ticket_category (id INT PRIMARY KEY AUTO_INCREMENT,
NAME VARCHAR(50) NOT NULL,is_active int default 1);

INSERT INTO ticket_category(NAME) VALUES
('Issue'),
('Clarifications'),
('Suggestion');