CREATE table pcmember (NAME VARCHAR(10) NOT null, id VARCHAR(10) NOT NULL PRIMARY KEY, PASSWORD VARCHAR(10) NOT NULL, TIME VARCHAR(10) NOT NULL, payment VARCHAR(5) NOT NULL, money INT(5) NOT NULL);
INSERT INTO pcmember (NAME, id, PASSWORD, TIME, payment, money) VALUES ('이지아', 'asdf1234', '1234', '00:00', '선불', '0');

pcmemberCREATE table pc (num int(10) NOT NULL, id VARCHAR(10) PRIMARY KEY);
INSERT INTO pc (num, id) VALUES ('1', '1'), ('2', '2'), ('3', '3'), ('4', '4'), ('5', '5'), ('6', '6');