package com.techlabs.employees;

public abstract class Employee {
	private String name;
	protected double basicSalary;
	protected double netSalary;
	private static long empId;
	private long id;
	
	static {
		empId=100;
	}
	
	Employee(String name,double basicSalary){
		this.name=name;
		this.basicSalary=basicSalary;
		this.id=++empId;
	}
	
	abstract void calculateSalary();
	
	public String getName() {
		return name;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public double getNetSalary() {
		return netSalary;
	}

	public static long getId() {
		return empId;
	}
	
}
