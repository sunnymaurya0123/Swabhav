CREATE TABLE `customer1` (
	`customer_id` INT(11) NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(30) NOT NULL,
	`balance` DOUBLE NOT NULL,
	PRIMARY KEY (`customer_id`)
)
CREATE TABLE `merchant` (
	`merchant_id` INT(11) NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(30) NOT NULL,
	`balance` DOUBLE NOT NULL,
	PRIMARY KEY (`merchant_id`)
)
select * from customer1;
select * from merchant;
update customer1 set balance=balance-5000 where customer_id=3;
update merchant set balance=balance-5000 where merchant_id=3;