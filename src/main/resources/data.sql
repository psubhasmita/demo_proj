DROP TABLE IF EXISTS Employee;

CREATE TABLE Employee(
id INT PRIMARY KEY,
name varchar(200) NOT NULL,
salary INT NOT NULL);

INSERT INTO Employee(id,name,salary) VALUES (1,'soma',20000),
(2,'subha',30000),
(3,'smita',50000);