create table Customer(
	customer_id int NOT NULL PRIMARY KEY,
	name varchar(30)		
);
insert into Customer (customer_id,name) values (1,'Sunny');
select * from Customer;

create table Orders(
	customer_id int NOT NULL,
	order_id int NOT NULL PRIMARY KEY,
	date varchar(30) NOT NULL,
	FOREIGN KEY (customer_id) REFERENCES Customer(customer_id)
	
);DROP table Orders;
select * from Orders;

create table LineItem(
	lineitem_id int NOT NULL PRIMARY KEY,
);
