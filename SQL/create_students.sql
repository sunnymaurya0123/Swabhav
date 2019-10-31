create table Students( 
	rollno int NOT NULL,
	name varchar(50) NOT NULL,
	cgpa float NOT NULL,
	PRIMARY KEY (rollno)
);
DROP table Students;
select * from Students;
insert into Students(rollno,name,cgpa) values (3,'sunny',9.5);
insert into Students(rollno,name,cgpa) values (2,'ravi',7.4);
update Students set name='akash' where rollno=1;
delete from Students where name='ravi';
create table College(
	id int NOT NULL,
	name varchar(30) NOT NULL,
	description varchar(30),
	PRIMARY KEY (id)
);
create table Students(
	clg_id int NOT NULL, 
	rollno int NOT NULL,
	name varchar(50) NOT NULL,
	cgpa float NOT NULL,
	PRIMARY KEY (rollno),
	FOREIGN KEY (clg_id) REFERENCES College(id)
);
select * from College;
select * from Students;
insert into Students(clg_id,rollno,name,cgpa) values (1,1,'akash',7.5);
DROP TABLE Students;