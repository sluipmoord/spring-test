DROP TABLE IF EXISTS people;

CREATE TABLE people  (
    person_id int(11) NOT NULL auto_increment,
    first_name varchar(20),
    last_name varchar(20),
    PRIMARY KEY (`person_id`)
);