package com.techlabs.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techlabs.entity.Student;

public class StudentTest {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		System.out.println(factory.getClass());
		
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		
		Transaction txn = null;
		Session session = null;
		
		try {
			 session = factory.openSession();
			 System.out.println(session);
			 
			 
			 s1.setName("Sunny");
//			 s1.setRollNo(30);
			 s1.setCgpi(9.5);
			 
			 s2.setName("Ravi");
//			 s2.setRollNo(40);
			 s2.setCgpi(8.5);
			 
			 s3.setName("Akash");
//			 s3.setRollNo(50);
			 s3.setCgpi(7.5);
			 
			 txn= session.beginTransaction();
			 session.save(s1);
			 session.save(s2);
			 session.save(s3);
			 
			 txn.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			if(txn!=null)
				txn.rollback();
		} finally {
			if(session.isOpen())
				session.close();
		}

	}
}
