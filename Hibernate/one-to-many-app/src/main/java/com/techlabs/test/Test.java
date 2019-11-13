package com.techlabs.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techlabs.entity.Department;
import com.techlabs.entity.Employee;

public class Test {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		System.out.println(factory.getClass());
		
		Department dept1=new Department();
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		
		Transaction txn = null;
		Session session = null;
		
		try {
			 session = factory.openSession();
			 System.out.println(session);
			 
			 dept1.setName("sales");
			 dept1.setLocation("mumbai");
			 
			 e1.setName("Sunny");
			 e1.setDept(dept1);
			 e1.setSalary(100000);
			 
			 e2.setName("Ravi");
			 e2.setDept(dept1);
			 e2.setSalary(200000);
			 
			 e3.setName("Nilam");
			 e3.setDept(dept1);
			 e3.setSalary(300000);
			 
			 dept1.getEmp().add(e1);
			 dept1.getEmp().add(e2);
			 dept1.getEmp().add(e3);
			 
			 dept1.setEmp(dept1.getEmp());
			 
			 txn= session.beginTransaction();
			 session.save(dept1);

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
