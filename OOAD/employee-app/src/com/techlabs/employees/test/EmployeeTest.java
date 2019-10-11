package com.techlabs.employees.test;

import com.techlabs.employees.Analyst;
import com.techlabs.employees.Developer;
import com.techlabs.employees.Employee;
import com.techlabs.employees.Manager;

public class EmployeeTest {

	public static void main(String[] args) {
		Manager manager1=new Manager("ABCManager",65_000);
		//manager1.calculateSalary();
		printSlip(manager1);
		Developer developer1=new Developer("Sunny",100_000);
		//developer1.calculateSalary();
		printSlip(developer1);
		Analyst analyst1=new Analyst("XYZAnalyst",50_000);
		//analyst1.calculateSalary();
		printSlip(analyst1);

	}
	
	static void printSlip(Employee employee) {
		System.out.println("Employee Name: "+employee.getName()+"\nEmployee id: "+employee.getId()
							+"\nEmployee Basic Salary: "+employee.getBasicSalary()+"\nEmployee Net Salary: "+employee.getNetSalary()+"\n");
	}

}
