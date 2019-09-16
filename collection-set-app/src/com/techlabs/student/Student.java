package com.techlabs.student;

import java.util.Comparator;

public class Student implements Comparable<Student> {
	private int rollno;
	private int standard;
	private String name;
	private float cgpi;

	public Student(int rollno, int standard, String name, float cgpi) {
		this.rollno = rollno;
		this.standard = standard;
		this.name = name;
		this.cgpi = cgpi;
	}

//	@Override
//	public int hashCode() {
//		return name.hashCode();
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		Student student = (Student) obj;
//		// if(this.rollno==student.rollno&&this.standard==student.standard)
//		return (getRollno() == student.getRollno()) && (getStandard() == student.standard);
//	}

	public int getRollno() {
		return rollno;
	}

	public int getStandard() {
		return standard;
	}

	public String getName() {
		return name;
	}

	public float getCgpi() {
		return cgpi;
	}

	@Override
	public int compareTo(Student student2) {

		if (this.getRollno() == student2.getRollno() && !(this.getStandard() == student2.getStandard())) {
			return this.getStandard() - student2.getStandard();
		} else if (!(this.getRollno() == student2.getRollno()))
			return this.getRollno() - student2.getRollno();
		else
			this.name.compareTo(student2.getName());
		return 0;

	}

}
