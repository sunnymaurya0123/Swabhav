create table Customer(
	customer_id int NOT NULL PRIMARY KEY,
	name varchar(30)		
);
create table Orders(
	customer_id int NOT NULL,
	order_id int NOT NULL PRIMARY KEY,
	date varchar(30) NOT NULL,
	FOREIGN KEY (customer_id) REFERENCES Customer(customer_id)
	
);
create table LineItem(
	order_id int NOT NULL,
	lineitem_id int NOT NULL PRIMARY KEY,
	quantity int NOT NULL,
	FOREIGN KEY (order_id) REFERENCES Orders(order_id)
);
create table Product(
	lineitem_id int NOT NULL,
	product_id int NOT NULL PRIMARY KEY,
	name varchar(30) NOT NULL,
	price double NOT NULL,
	discountPercent float NOT NULL,
	FOREIGN KEY (lineitem_id) REFERENCES LineItem(lineitem_id)
);
insert into Customer (customer_id,name) values (1,'Sunny');
insert into Orders (customer_id,order_id,date) values (1,1,'11/01/15');
insert into Orders (customer_id,order_id,date) values (1,2,'15/02/15');
insert into LineItem (order_id,lineitem_id,quantity) values (1,1,2);
insert into LineItem (order_id,lineitem_id,quantity) values (1,2,4);
insert into LineItem (order_id,lineitem_id,quantity) values (2,3,3);
insert into LineItem (order_id,lineitem_id,quantity) values (2,4,5);
insert into Product (lineitem_id,product_id,name,price,discountPercent) values (1,1,'Book',700,40);
insert into Product (lineitem_id,product_id,name,price,discountPercent) values (1,2,'Pencil',10,4);
DROP table Product;
select * from Customer;
select * from Orders;
select * from LineItem;
select * from Product;
