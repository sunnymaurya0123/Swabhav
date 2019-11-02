package com.techlabs.service;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.Student;

public class StudentService {
	
	private static StudentService singleObject;
	private List<Student> studentList;
	Student s1=new Student("Sunny",9.7);
	Student s2=new Student("Akash",8.5);
	Student s3=new Student("Ravi",7.6);
	Student s4=new Student("Nilam",6.6);
	Student s5=new Student("Floyd",5.6);
	Student s6=new Student("Pratik",7.4);
	
	private StudentService() {
		System.out.println("Inside Service");
		studentList=new ArrayList<Student>();
		add(s1);
		add(s2);
		add(s3);
		add(s4);
		add(s5);
		add(s6);
	}
	
	public static StudentService getInstance() {
		if(singleObject==null)
			singleObject=new StudentService();
		return singleObject;
	}
	
	public List<Student> get(){
		return studentList;
	}
	
	public void add(Student student) {
		studentList.add(student);
		System.out.println(studentList.size());
	}
	
	public Student get(int id) {
		for(Student student:studentList) {
			if(student.getId()==id)
				return student;
		}
		return null;
	}
	
	public void edit(int id,Student student) {
		Student oldStudent=get(id);
		oldStudent.setName(student.getName());
		oldStudent.setCgpi(student.getCgpi());
		System.out.println(oldStudent.getCgpi());
	}
	
	public void remove(int id) {
		studentList.remove(get(id));
	}
	
}
