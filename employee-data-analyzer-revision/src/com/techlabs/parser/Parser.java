package com.techlabs.parser;

import java.io.*;
import java.util.*;

import com.techlabs.employee.Employee;
import com.techlabs.loader.Loader;

public class Parser {
	private String line;
	private String data[];
	private Map<Employee,Employee> employeeList=new TreeMap<Employee,Employee>();
	
	public Parser(Loader loader) throws NumberFormatException, IOException{
		while ((line = loader.getBufferReader().readLine()) != null) {
			data = line.split(",");
			if (data[6].equals("NULL"))
				data[6] = "0";
			if (data[3].equals("NULL"))
				data[3] = "0";
			employeeList.put(new Employee(Integer.parseInt(data[0]), data[1], data[2], Integer.parseInt(data[3]),
					data[4], Double.parseDouble(data[5]), Double.parseDouble(data[6]), Integer.parseInt(data[7])), null);
		}
		
	}
	
	public Map<Employee, Employee> getEmployeeList() {
		return employeeList;
	}
}
