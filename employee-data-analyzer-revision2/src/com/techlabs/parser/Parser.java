package com.techlabs.parser;

import java.util.Map;
import java.util.TreeMap;

import com.techlabs.employee.Employee;
import com.techlabs.loader.ILoader;

public class Parser {
	private String data[];
	private String empData[];
	private String line;
	private Map<Employee,Employee> employeeList;
	
	public Parser(ILoader iLoader){
		employeeList=new TreeMap<Employee,Employee>();
		line=iLoader.load();
	}
	
	public Map<Employee, Employee> parse() {
		empData =line.split("\n");
		for(String strings:empData) {
			data = strings.split(",");
			if (data[6].equals("NULL"))
				data[6] = "0";
			if (data[3].equals("NULL"))
				data[3] = "0";
			employeeList.put(new Employee(Integer.parseInt(data[0]), data[1], data[2], Integer.parseInt(data[3]),
					data[4], Double.parseDouble(data[5]), Double.parseDouble(data[6]), Integer.parseInt(data[7])), null);
			}
		return employeeList;
	}

}
