package com.techlabs.calculator;

public class Calculator {
	
	public static int add(int num1,int num2) throws RuntimeException {
		if(num1>=0&&num2>=0)
		return num1+num2;
		else
			throw new RuntimeException("Negative numbers not allowed");
	}
	
	public static int cubeEven(int num) {
		if(num>0)
		return num*num*num;
		else
			throw new RuntimeException("Negative numbers not allowed");
	}
}
