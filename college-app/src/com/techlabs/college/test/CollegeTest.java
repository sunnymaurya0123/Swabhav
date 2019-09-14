package com.techlabs.college.test;

import java.util.ArrayList;

import com.techlabs.college.College;
import com.techlabs.person.Branch;
import com.techlabs.person.Person;
import com.techlabs.person.Professor;
import com.techlabs.person.Student;

public class CollegeTest {

	public static void main(String[] args) {
		
		College college =new College(853,"VIVA","Shirgaon");
		College college1=new College(654,"XYZ","ADF");
		
		ArrayList<College> collegeList=new ArrayList<College>();
		collegeList.add(college);
		collegeList.add(college1);
//		Student student2=new Student("Dadar","15/10/1993",Branch.CIVIL);
//		Professor professor2=new Professor("Diva","12/11/2004",28);
//		Student student1 = new Student("Dahisar", "08/11/1997", Branch.COMPUTER);
//		Professor professor1 = new Professor("Andheri", "15/05/1983", 30);

		printInfo(college);
		printInfo(college1);

	}
	
	static void printInfo(College college) {
		System.out.println("\nCollege Id: "+college.getClgId()+" Name: "+college.getName()+" Address: "+college.getAddress());
		for(Student student:college.getStudentList())
			System.out.println("Student : "+student.getId()+" Address: "+student.getAddress()+
								" dob: "+student.getDob()+" Branch: "+student.getBranch());
		
		for(Professor professor:college.getProfessorList()) {
			System.out.println("Professor : "+professor.getId()+" Address: "+professor.getAddress()+
					" dob: "+professor.getDob()+" Salary: "+professor.getSalary());
		}
	}

}
