package com.techlabs.person;

public class Student extends Person {
	private Branch branch;

	public Student(String address, String dob, Branch branch) {
		super(address,dob);
		this.branch=branch;
	}

	public Branch getBranch() {
		return branch;
	}
}
