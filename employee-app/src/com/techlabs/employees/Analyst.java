package com.techlabs.employees;

public class Analyst extends Employee{

	private double perks;
	private double bonus;
	
	public void evaluatePerks() {
		perks=basicSalary*0.3;
	}
	
	public void evaluateBonus() {
		bonus=basicSalary*0.2;
	}
	
	public Analyst(String name, double basicSalary) {
		super(name, basicSalary);
		evaluatePerks();
		evaluateBonus();
		calculateSalary();
	}
	@Override
	public void calculateSalary() {
		netSalary=basicSalary+perks+bonus;
		
	}

}
