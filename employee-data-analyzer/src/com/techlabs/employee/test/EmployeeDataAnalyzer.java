package com.techlabs.employee.test;

import java.util.*;
import com.techlabs.employee.Employee;

public class EmployeeDataAnalyzer {
	private double max;
	private int managerCount, clerkCount, analystCount, salesmanCount, presidentCount;
	private int tenCount, twentyCount, thirtyCount;

	public final int DEPARTMENT_NO_TEN = 10;
	public final int DEPARTMENT_NO_TWENTY = 20;
	public final int DEPARTMENT_NO_THIRTY = 30;
	private final String PRESIDENT = "'PRESIDENT'";
	private final String CLERK = "'CLERK'";
	private final String ANALYST = "'ANALYST'";
	private final String SALESMAN = "'SALESMAN'";
	private final String MANAGER = "'MANAGER'";

	Set<Employee> employeeList = new TreeSet<Employee>();

	public Set<Employee> getMaxSalariedEmployee(Set<Employee> employeeList) {
		for (Employee employee : employeeList) {
			if (employee.getSalary() > max)
				max = employee.getSalary();
		}
		for (Employee employee : employeeList) {
			if (employee.getSalary() == max)
				this.employeeList.add(employee);
		}
		return this.employeeList;
	}

	public void initializeEmloyeesCountBasedOnDesignation(Set<Employee> employeeList) {
		for (Employee employee : employeeList) {
			switch (employee.getDesignation()) {
			case PRESIDENT:
				presidentCount++;
				break;
			case MANAGER:
				managerCount++;
				break;
			case CLERK:
				clerkCount++;
				break;
			case ANALYST:
				analystCount++;
				break;
			case SALESMAN:
				salesmanCount++;
				break;
			default:
				break;
			}
		}
	}

	public void initializeEmloyeesCountBasedOnDepartment(Set<Employee> employeeList) {
		for (Employee employee : employeeList) {
			switch (employee.getDepartmentNumber()) {
			case DEPARTMENT_NO_TEN:
				tenCount++;
				break;
			case DEPARTMENT_NO_TWENTY:
				twentyCount++;
				break;
			case DEPARTMENT_NO_THIRTY:
				thirtyCount++;
				break;
			default:
				break;
			}
		}
	}

	public int getManagerCount() {
		return managerCount;
	}

	public int getClerkCount() {
		return clerkCount;
	}

	public int getAnalystCount() {
		return analystCount;
	}

	public int getSalesmanCount() {
		return salesmanCount;
	}

	public int getPresidentCount() {
		return presidentCount;
	}
	
	public int getTenCount() {
		return tenCount;
	}

	public int getTwentyCount() {
		return twentyCount;
	}

	public int getThirtyCount() {
		return thirtyCount;
	}

}
