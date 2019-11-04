CREATE TABLE `Contact` (  
`contact_id` INT(30) NOT NULL AUTO_INCREMENT PRIMARY KEY,  
`FirstName` VARCHAR(30) NOT NULL,  
`LastName` VARCHAR(30) NOT NULL,  
`Email_Id` VARCHAR(30) NOT NULL,  
`phone_No` VARCHAR(30) NOT NULL );
select * from  Contact;
insert into Contact(FirstName,LastName,Email_Id,phone_No) values("Ravi","Maurya","ravi@dsvsdv",96841);
update Contact set FirstName='Rabba',LastName='Maury',Email_Id='rabba@gmail.com',phone_No=846165153 where contact_id=1;
drop table Contact