package com.techlabs.repository;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlabs.entity.Student;

@Repository
public class StudentDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	private List<Student> studentList;
	
	public StudentDAO(){
		System.out.println("Repo Created");
	}
	
	public List<Student> get(){
		Session session=sessionFactory.openSession();
		Criteria crit = session.createCriteria(Student.class);
		studentList = crit.list();
		System.out.println(studentList);
		return studentList;
	}
	
}
