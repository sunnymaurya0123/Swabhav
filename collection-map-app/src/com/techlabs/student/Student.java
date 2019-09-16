package com.techlabs.student;

public class Student {
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
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Student student = (Student) obj;
		// if(this.rollno==student.rollno&&this.standard==student.standard)
		return (this.getRollno() == student.getRollno()) && (this.getStandard() == student.getStandard());
	}

}
