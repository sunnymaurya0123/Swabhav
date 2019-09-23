package com.techlabs.analyzer;

import java.util.*;
import java.util.Map.Entry;

import com.techlabs.employee.Employee;
import com.techlabs.parser.Parser;

public class Analyzer {

	private Map<Employee,Employee> employeeList;
	private double max;
	public Analyzer(Parser parser) {
		employeeList=parser.parse();
	}

	public Employee getMaxSalariedEmployee() {
		for (Entry<Employee, Employee> entry : employeeList.entrySet()) {
			if(entry.getKey().getSalary()>max)
				max = entry.getKey().getSalary();
		}
		for (Entry<Employee, Employee> entry : employeeList.entrySet()) {
		if (entry.getKey().getSalary() == max)
			return entry.getKey();
		}
		return null;
	}

	public Map<Integer, Integer> getDepartmentWiseEmployeeCount() {
		Map<Integer, Integer> map=new TreeMap<Integer,Integer>();
		for (Entry<Employee, Employee> entry : employeeList.entrySet()) {
		   if(map.containsKey(entry.getKey().getDepartmentNumber()))
			map.put(entry.getKey().getDepartmentNumber(),map.get(entry.getKey().getDepartmentNumber())+1);
		   else
			   map.put(entry.getKey().getDepartmentNumber(), 1);
		}
		return map;
	}

	public Map<String, Integer> getDesignationWiseEmployeeCount() {
		Map<String,Integer> map=new TreeMap<String,Integer>();
		for (Entry<Employee, Employee> entry : employeeList.entrySet()) {
		    if(map.containsKey(entry.getKey().getDesignation()))
			map.put(entry.getKey().getDesignation(),map.get(entry.getKey().getDesignation())+1);
		    else
		    	map.put(entry.getKey().getDesignation(), 1);
		    
		}
		return map;
	}

}
