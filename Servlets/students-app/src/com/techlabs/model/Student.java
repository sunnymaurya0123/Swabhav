package com.techlabs.model;

public class Student {
	private int id;
	private String name;
	private double cgpi;
	private static int sid;
	
	static {
		sid=100;
	}
	
	public Student(String name, double cgpi) {
		id=++sid;
		this.name=name;
		this.cgpi=cgpi;
		
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCgpi() {
		return cgpi;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCgpi(double cgpi) {
		this.cgpi = cgpi;
	}

	
}
