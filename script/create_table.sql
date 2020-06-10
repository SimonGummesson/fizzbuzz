CREATE TABLE account (id serial PRIMARY KEY, username varchar(255) NOT NULL, password varchar(255) NOT NULL);

INSERT INTO account(username, password)VALUES('test', 'test');

select * from account;