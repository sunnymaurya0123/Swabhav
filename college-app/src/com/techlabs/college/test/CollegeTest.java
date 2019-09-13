package com.techlabs.college.test;

import java.util.ArrayList;

import com.techlabs.college.College;
import com.techlabs.person.Branch;
import com.techlabs.person.Professor;
import com.techlabs.person.Student;

public class CollegeTest {

	public static void main(String[] args) {
		Student student1=new Student("Dahisar","08/11/1997",Branch.COMPUTER);
		Professor professor1=new Professor("Andheri","15/05/1983",36_451);
		College college =new College();
		ArrayList<?> list=new ArrayList();
		//list.add(student1);
		printInfo(college);

	}
	
	static void printInfo(College college) {
		System.out.println(college);
	}

}
