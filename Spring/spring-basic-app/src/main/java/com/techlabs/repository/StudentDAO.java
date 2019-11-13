package com.techlabs.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.techlabs.model.Student;

@Repository
public class StudentDAO {
	
	private List<Student> studentList;
	private Student s1=new Student("Sunny", 30, 7.5);
	private Student s2=new Student("Ravi", 40, 8.5);
	private Student s3=new Student("Akash", 50, 9.5);
	
	public StudentDAO(){
		studentList=new ArrayList<Student>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		
	}
	
	public List<Student> get(){
		return studentList;
	}
	
	public void addStudent(Student student) {
		studentList.add(student);
	}
}
