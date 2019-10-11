package com.techlabs.student.test;

import java.util.Set;
import java.util.TreeSet;

import com.techlabs.student.NameComparator;
import com.techlabs.student.Student;

public class TestTreeSet {

	public static void main(String[] args) {
		Student s1 = new Student(101, 5, "Sunny", 8.5f);
		Student s2 = new Student(101, 5, "Funny", 8.5f);
		Student s3 = new Student(102, 10, "Ravi", 9.5f);
		Student s4 = new Student(203, 12, "Surendra", 6.7f);

		Set<Student> students;
		Set<Student> students1;
		NameComparator nameCompare = new NameComparator();
		students1 = new TreeSet<Student>(nameCompare);
		students1.add(s1);
		students1.add(s2);
		students1.add(s3);
		students1.add(s4);

		students = new TreeSet<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		System.out.println("Strngth of Class: " + students.size());
		for (Student student : students) {
			System.out.println("Name: " + student.getName() + " Standard: " + student.getStandard() + " Rollno: "
					+ student.getRollno() + " Cgpi: " + student.getCgpi());
		}
		System.out.println("\nSorting By Name");
		for (Student student : students1) {
			System.out.println("Name: " + student.getName() + " Standard: " + student.getStandard() + " Rollno: "
					+ student.getRollno() + " Cgpi: " + student.getCgpi());
		}

	}

}
