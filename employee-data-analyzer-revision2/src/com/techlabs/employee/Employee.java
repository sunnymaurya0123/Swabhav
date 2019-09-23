package com.techlabs.employee;

public class Employee implements Comparable<Employee> {
	private int empId;
	private int managerId;
	private String name;
	private String designation;
	private String dateOfJoin;
	private double salary;
	private double commission;
	private int departmentNumber;
	
	public Employee(int empId,String name,String designation,int managerId,
			String dateOfJoin,double salary,double commission,int departmentNumber) {
		this.empId=empId;
		this.name=name;
		this.designation=designation;
		this.managerId=managerId;
		this.dateOfJoin=dateOfJoin;
		this.salary=salary;
		this.commission=commission;
		this.departmentNumber=departmentNumber;
	}
	
	public int getEmpId() {
		return empId;
	}

	public int getManagerId() {
		return managerId;
	}

	public String getName() {
		return name;
	}

	public String getDesignation() {
		return designation;
	}

	public String getDateOfJoin() {
		return dateOfJoin;
	}

	public double getSalary() {
		return salary;
	}

	public double getCommission() {
		return commission;
	}

	public int getDepartmentNumber() {
		return departmentNumber;
	}

	@Override
	public int compareTo(Employee employee) {
		return this.name.compareTo(employee.name);
	}

}
