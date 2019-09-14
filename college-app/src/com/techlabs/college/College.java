package com.techlabs.college;

import java.util.ArrayList;
import java.util.Iterator;

import com.techlabs.person.Branch;
import com.techlabs.person.Person;
import com.techlabs.person.Professor;
import com.techlabs.person.Student;

public class College{
	private String name;
	private String address;
	private int clg_id;
	private ArrayList<Student> studentList;
	private ArrayList<Professor> professorList;

	public College(int clg_id, String name, String address) {
		this.clg_id = clg_id;
		this.name = name;
		this.address = address;
		studentList = new ArrayList<Student>();
		professorList = new ArrayList<Professor>();
		addStudent(studentList);
		addProfessor(professorList);
		//add(studentList, professorList);

	}

//	private void add(ArrayList<Student> studentList, ArrayList<Professor> professorList) {
//		professorList.add(professor1);
//		studentList.add(student1);
//	}
	
	void addStudent(ArrayList<Student> studentList) {
		studentList.add(student1);
		studentList.add(student2);
	}
	
	void addProfessor(ArrayList<Professor> professorList) {
		professorList.add(professor1);
		professorList.add(professor2);
	}

	Student student2=new Student("Dadar","15/10/1993",Branch.CIVIL);
	Professor professor2=new Professor("Diva","12/11/2004",28);
	Student student1 = new Student("Dahisar", "08/11/1997", Branch.COMPUTER);
	Professor professor1 = new Professor("Andheri", "15/05/1983", 30);

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
		return student2;
	}

	public Professor getProfessor() {
		return professor2;
	}

	public Iterable<Student> getStudentList() {
		return studentList;
	}

	public Iterable<Professor> getProfessorList() {
		return professorList;
	}

}
