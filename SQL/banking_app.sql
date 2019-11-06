create table bankmaster(
	name varchar(30) NOT NULL PRIMARY KEY,
	pswd varchar(30) NOT NULL,
	balance double NOT NULL
);
create table banktxn(
	name varchar(30) NOT NULL,
	amount double NOT NULL,
	txn_type varchar(10) NOT NULL,
	txn_date date NOT NULL,
	foreign key (name) references bankmaster(name)
);
select * from bankmaster;
select * from banktxn;
delete from bankmaster where name='Sunny';
delete from banktxn where name='Sunny';