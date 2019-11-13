package com.techlabs.model;

public class Student {
	private String name;
	private int rollNo;
	private double cgpi;

	public Student(String name, int rollNo, double cgpi) {
		this.name = name;
		this.rollNo = rollNo;
		this.cgpi = cgpi;
	}

	public String getName() {
		return name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public double getCgpi() {
		return cgpi;
	}

}
