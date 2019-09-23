package com.techlabs.parser;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import com.techlabs.employee.Employee;
import com.techlabs.filetostring.DataToStringConverter;
import com.techlabs.loader.FileLoader;
import com.techlabs.loader.UrlLoader;

public class Parser {
	private String data[];
	private String empData[];
	private Map<Employee,Employee> employeeList=new TreeMap<Employee,Employee>();
	private DataToStringConverter s=new DataToStringConverter();
	
	public Parser(FileLoader fileLoader) throws NumberFormatException, IOException{
		this(fileLoader,null);
		}
	
	public Parser(UrlLoader urlLoader) throws IOException {
		this(null,urlLoader);
	}
	
	Parser(FileLoader fileLoader,UrlLoader urlLoader) throws IOException {
		if(fileLoader==null)
			empData = s.getLine(urlLoader.getBufferReader()).split("\n");
		else
			empData = s.getLine(fileLoader.getBufferReader()).split("\n");
		for(String string:empData) {
		data = string.split(",");
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
