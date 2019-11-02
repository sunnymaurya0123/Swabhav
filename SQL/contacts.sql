CREATE TABLE `Contact` (  
`contact_id` INT(30) NOT NULL AUTO_INCREMENT PRIMARY KEY,  
`FirstName` VARCHAR(30) NOT NULL,  
`LastName` VARCHAR(30) NOT NULL,  
`Email_Id` VARCHAR(30) NOT NULL,  
`phone_No` INT(30) NOT NULL )
select * from  Contact
insert into Contact(FirstName,LastName,Email_Id,phone_No) values("Ravi","Maurya","ravi@dsvsdv",96841);