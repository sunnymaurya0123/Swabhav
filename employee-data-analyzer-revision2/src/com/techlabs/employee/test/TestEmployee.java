package com.techlabs.employee.test;

import java.io.*;
import java.util.*;

import com.techlabs.analyzer.Analyzer;
import com.techlabs.employee.Employee;
import com.techlabs.loader.FileLoader;
import com.techlabs.loader.UrlLoader;
import com.techlabs.parser.Parser;

public class TestEmployee {

	public static void main(String[] args) throws NumberFormatException, FileNotFoundException, IOException {
		Analyzer analyzer =new Analyzer(new Parser(new UrlLoader("https://swabhav-tech.firebaseapp.com/emp.txt")));
		Analyzer analyzer1 =new Analyzer(new Parser(new FileLoader("Resources/dataFile.txt")));

		Employee employee=analyzer.getMaxSalariedEmployee();
		System.out.println(employee.getSalary());
		
		Map<Integer,Integer> emp=analyzer.getDepartmentWiseEmployeeCount();
		System.out.println(emp);
		
		Map<String,Integer> empl=analyzer.getDesignationWiseEmployeeCount();
		System.out.println(empl);
		
		Employee employee1=analyzer1.getMaxSalariedEmployee();
		System.out.println(employee1.getSalary());
		
		Map<Integer,Integer> emp1=analyzer1.getDepartmentWiseEmployeeCount();
		System.out.println(emp1);
		
		Map<String,Integer> empl1=analyzer1.getDesignationWiseEmployeeCount();
		System.out.println(empl1);
	}

}