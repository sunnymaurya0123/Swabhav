package com.techlabs.student.test;

import java.util.TreeMap;
import java.util.Map.Entry;

import com.techlabs.student.Student;

public class TestTreeMap {

	public static void main(String[] args) {
		TreeMap<Student,Student> students=new TreeMap<Student,Student>();
		Student s1 = new Student(101, 5, "Sunny", 8.5f);
		Student s2 = new Student(101, 5, "Sunny", 8.5f);
		Student s3 = new Student(102, 10, "Ravi", 9.5f);
		Student s4 = new Student(203, 12, "Surendra", 6.7f);
		
		students.put(s1, s2);
		students.put(s3, null);
		//students.put(s3, s4);
		
		System.out.println(students.size());
		for (Entry<Student, Student> entry : students.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
		}

	}

}
