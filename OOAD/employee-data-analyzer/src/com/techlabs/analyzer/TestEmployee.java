package com.techlabs.analyzer;

import java.io.*;
import java.util.*;

import com.techlabs.employee.Employee;
import com.techlabs.employee.test.EmployeeDataAnalyzer;

public class TestEmployee {

	public static void main(String[] args) throws IOException {
		Set<Employee> employeeList = new TreeSet<Employee>();
		String s;
		String[] data = null;
		File file = new File("Resources/dataFile.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferReader = new BufferedReader(fileReader);
		while ((s = bufferReader.readLine()) != null) {
			data = s.split(",");
			if (data[6].equals("NULL"))
				data[6] = "0";
			if (data[3].equals("NULL"))
				data[3] = "0";
			employeeList.add(new Employee(Integer.parseInt(data[0]), data[1], data[2], Integer.parseInt(data[3]),
					data[4], Double.parseDouble(data[5]), Double.parseDouble(data[6]), Integer.parseInt(data[7])));
		}
		bufferReader.close();
		System.out.println("Total number of employees: " + employeeList.size());

		EmployeeDataAnalyzer employeeDataAnalyzer = new EmployeeDataAnalyzer();
		Set<Employee> maxSalariedEmployee = employeeDataAnalyzer.getMaxSalariedEmployee(employeeList);
		System.out.println(printMaxSalariedEmployee(maxSalariedEmployee));

		employeeDataAnalyzer.initializeEmloyeesCountBasedOnDesignation(employeeList);
		printEmloyeesCountBasedOnDesignation(employeeDataAnalyzer);

		employeeDataAnalyzer.initializeEmloyeesCountBasedOnDepartment(employeeList);
		printEmloyeesCountBasedOnDepartment(employeeDataAnalyzer);
	}

	static void printEmloyeesCountBasedOnDepartment(EmployeeDataAnalyzer employeeDataAnalyzer) {
		System.out.println("\nTotal Number of employees based on department:\nTotal employees in department no: "
				+ employeeDataAnalyzer.DEPARTMENT_NO_TEN + " are " + employeeDataAnalyzer.getTenCount()
				+ "\nTotal employees in department no: " + employeeDataAnalyzer.DEPARTMENT_NO_TWENTY + " are "
				+ employeeDataAnalyzer.getTwentyCount() + "\nTotal employees in department no: "
				+ employeeDataAnalyzer.DEPARTMENT_NO_THIRTY + " are " + employeeDataAnalyzer.getThirtyCount());
	}

	static void printEmloyeesCountBasedOnDesignation(EmployeeDataAnalyzer e) {
		System.out.println("\nTotal Number of employees based on designation:\nTotal Managers: " + e.getManagerCount()
				+ "\nTotal Clerks: " + e.getClerkCount() + "\nTotal Analyst: " + e.getAnalystCount()
				+ "\nTotal Salesman: " + e.getSalesmanCount() + "\nTotal President: " + e.getPresidentCount());
	}

	static String printMaxSalariedEmployee(Set<Employee> maxSalariedEmployee) {
		for (Employee employee : maxSalariedEmployee)
			return "\nThe Maximum salaried employee is:\nEmployee id: " + employee.getEmpId() + "\nEmployee Name: "
					+ employee.getName() + "\nEmployee Designation: " + employee.getDesignation() + "\nManager id: "
					+ employee.getManagerId() + "\nDate of Joining:" + employee.getDateOfJoin() + "\nSalary: "
					+ employee.getSalary() + "\nCommision: " + employee.getCommission() + "\nDepartment No: "
					+ employee.getDepartmentNumber();
		return null;
	}

}