package com.techlabs.test;

import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techlabs.entity.Student;

public class StudentTest {
	private static Session session;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		System.out.println(factory.getClass());

		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();

		Transaction txn = null;

		try {
			session = factory.openSession();
			System.out.println(session);

			s1.setName("Sunny");
			s1.setCgpi(9.5);

			s2.setName("Ravi");
			s2.setCgpi(8.5);

			s3.setName("Akash");
			s3.setCgpi(7.5);

			txn = session.beginTransaction();
//			session.save(s1);
//			session.save(s2);
//			session.save(s3);
//			delete(3);
			update(4);

			txn.commit();
			display();

		} catch (Exception e) {
			e.printStackTrace();
			if (txn != null)
				txn.rollback();
		} finally {
			if (session.isOpen())
				session.close();
		}

	}

	public static void display() {
		Query query = session.createQuery("from Student");
		Iterator<Student> it = query.iterate();
		while (it.hasNext()) {
			Student s = (Student) it.next();
			String name = s.getName();
			int rollNo = s.getRollNo();
			double cgpi = s.getCgpi();
			System.out.println("Name: " + name + " RollNo: " + rollNo + " Cgpi: " + cgpi);
		}
	}

	public static void delete(int val) {
		
		Query query = session.createQuery("from Student");
		Iterator<Student> it = query.iterate();
		while (it.hasNext()) {
			Student s = (Student) it.next();
			if(s.getRollNo()==val)
				session.delete(s);
		}
	}

	public static void update(int val) {

		Query query = session.createQuery("from Student");
		Iterator<Student> it = query.iterate();
		while (it.hasNext()) {
			Student s = (Student) it.next();
			if (s.getRollNo() == val) {
//				s.setName("Pratik");
				s.setCgpi(8.5);
				session.update(s);
			}
		}
	}
}
