package com.techlabs.college;

import java.util.ArrayList;

import com.techlabs.person.Branch;
import com.techlabs.person.Professor;
import com.techlabs.person.Student;

public class College {
	private  String name  ;
	private  String address ;
	private  int clg_id ;
	ArrayList list;
	
	public College(){
		list.add(professor);
		list.add(student);
	}

	Student student;
	Professor professor;
//	Student student1 = new Student("Dahisar", "08/11/1997", Branch.COMPUTER);
//	Professor professor1 = new Professor("Andheri", "15/05/1983", 36_451);
	
	

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getClgId() {
		return clg_id;
	}

	public Student getStudent() {
		return student;
	}

	public Professor getProfessor() {
		return professor;
	}

//	public Student getStudent1() {
//		return student1;
//	}
//
//	public Professor getProfessor1() {
//		return professor1;
//	}

}
