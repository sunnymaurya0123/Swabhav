package com.techlabs.employee.test;

import java.io.*;
import java.util.*;

import com.techlabs.analyzer.Analyzer;
import com.techlabs.employee.Employee;
import com.techlabs.loader.Loader;
import com.techlabs.parser.Parser;

public class TestEmployee {

	public static void main(String[] args) throws NumberFormatException, FileNotFoundException, IOException {
		Analyzer analyzer =new Analyzer(new Parser(new Loader("Resources/dataFile.txt")));
		
		Employee employee=analyzer.getMaxSalariedEmployee();
		System.out.println(employee.getSalary());
		
		Map<Integer,Integer> emp=analyzer.getDepartmentWiseEmployeeCount();
		System.out.println(emp);
		
		Map<String,Integer> empl=analyzer.getDesignationWiseEmployeeCount();
		System.out.println(empl);
	}

}
