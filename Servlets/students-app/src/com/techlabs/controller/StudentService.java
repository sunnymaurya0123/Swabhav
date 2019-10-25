package com.techlabs.controller;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.Student;

public class StudentService {
	
	List<Student> studentList;
	Student s1=new Student("Sunny",9.7);
	Student s2=new Student("Akash",8.5);
	Student s3=new Student("Ravi",7.6);
	Student s4=new Student("Nilam",6.6);
	Student s5=new Student("Floyd",5.6);
	Student s6=new Student("Pratik",7.4);
	
	public StudentService() {
		System.out.println("Inside Service");
		studentList=new ArrayList<Student>();
		add(s1);
		add(s2);
		add(s3);
		add(s4);
		add(s5);
		add(s6);
	}
	List<Student> get(){
		return studentList;
	}
	
	void add(Student student) {
		studentList.add(student);
		System.out.println(studentList.size());
	}
}
