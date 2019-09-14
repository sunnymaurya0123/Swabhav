package com.techlabs.person;

import com.techlabs.salariedemployee.SalariedEmployee;

public class Professor extends Person implements SalariedEmployee{

	private long salary;
	private int noOfWorkingDays;
	private static final int ONE_DAY_SALARY=1200;
	public Professor(String address, String dob, int noOfWorkingDays) {
		super(address,dob);
		this.noOfWorkingDays=noOfWorkingDays;
		calculateSalary();
		
	}
	@Override
	public void calculateSalary() {
		salary=noOfWorkingDays*ONE_DAY_SALARY;
		
	}
	public long getSalary() {
		return salary;
	}

}
