package com.techlabs.employees;

public class Developer extends Employee{

	private double pa;
	private double incentives;
	
	public void evaluatePA() {
		pa=basicSalary*0.4;
	}
	
	public void evaluateIncentives() {
		incentives=basicSalary*0.3;
	}
	
	public Developer(String name, double basicSalary) {
		super(name, basicSalary);
		evaluatePA();
		evaluateIncentives();
		calculateSalary();
	}
	@Override
	public void calculateSalary() {
		netSalary=basicSalary+pa+incentives;
		
	}

}
