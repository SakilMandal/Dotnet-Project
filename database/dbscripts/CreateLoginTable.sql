USE ems;
CREATE TABLE login (
    username VARCHAR(10) PRIMARY KEY,
    pass VARCHAR(20)
);

insert into login (username,pass) values ("admin","admin");