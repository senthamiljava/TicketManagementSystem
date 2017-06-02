CREATE TABLE tickets(id INT PRIMARY KEY AUTO_INCREMENT,
user_id INT NOT NULL,
summary VARCHAR(500) NOT NULL,
description LONGTEXT NOT NULL,
created_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
modified_date TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
status_id INT NOT NULL default 1,
category_id INT NOT NULL,
reviewed_by int ,
FOREIGN KEY(user_id) REFERENCES users(id),
FOREIGN KEY(status_id) REFERENCES ticket_status(id),
FOREIGN KEY(category_id) REFERENCES ticket_category(id),
FOREIGN KEY(reviewed_by) REFERENCES users(id)
);