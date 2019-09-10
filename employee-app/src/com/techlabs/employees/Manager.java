package com.techlabs.employees;

public class Manager extends Employee{
	private double hra;
	private double ta;
	private double da;
	
	void evaluateHRA() {
		hra=basicSalary*0.5;
	}
	
	void evaluateTA() {
		ta=basicSalary*0.4;
	}
	
	void evaluateDA() {
		da=basicSalary*0.3;
	}
	
	public Manager(String name,double basicSalary){
		super(name,basicSalary);
		evaluateHRA();
		evaluateTA();
		evaluateDA();
		calculateSalary();
	}

	@Override
	public void calculateSalary() {
		netSalary=basicSalary+hra+ta+da;
	}
	
}
