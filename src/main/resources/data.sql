CREATE TABLE IF NOT EXISTS person (
 id INT NOT NULL auto_increment,
 name VARCHAR(32),
 location VARCHAR(50),
 birth_date TIMESTAMP,
 PRIMARY KEY(id)
 );

 INSERT INTO person(name,location,birth_date) VALUES('Kek','Kyiv',CURRENT_TIMESTAMP);
 INSERT INTO person(name,location,birth_date) VALUES('Bob','Lviv',CURRENT_TIMESTAMP);
 INSERT INTO person(name,location,birth_date) VALUES('Sam','Rivne',CURRENT_TIMESTAMP);
 INSERT INTO person(name,location,birth_date) VALUES('Tom','Dnipro',CURRENT_TIMESTAMP);