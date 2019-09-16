package com.techlabs.student.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.techlabs.student.Student;

public class StudentTest {

	public static void main(String[] args) {
		HashMap<Student, Student> students = new HashMap<Student, Student>();
		Student s1 = new Student(101, 5, "Sunny", 8.5f);
		Student s2 = new Student(101, 5, "Funny", 8.5f);
		Student s3 = new Student(102, 10, "Ravi", 9.5f);
		Student s4 = new Student(203, 12, "Surendra", 6.7f);

		students.put(s1, s2);

		for (Entry<Student, Student> entry : students.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
		}

		// System.out.println(students);
		System.out.println(students.size());
	}

}
