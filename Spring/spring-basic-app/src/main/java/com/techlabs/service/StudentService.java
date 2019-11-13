package com.techlabs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.model.Student;
import com.techlabs.repository.StudentDAO;

@Service("studentSvc")
public class StudentService {
	
	@Autowired
	StudentDAO studentDAO;
	
	public List<Student> get(){
		return studentDAO.get();
	}
	
	public void addContact(Student student) {
		studentDAO.addStudent(student);
	}
}
