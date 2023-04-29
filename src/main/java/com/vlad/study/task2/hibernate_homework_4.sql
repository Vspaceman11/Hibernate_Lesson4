CREATE database hibernate_lesson4;
USE hibernate_lesson4;

DROP TABLE if exists animals ;
CREATE table animals
(
id bigInt auto_increment primary key,
name varchar(256),
age int,
tail bit
);