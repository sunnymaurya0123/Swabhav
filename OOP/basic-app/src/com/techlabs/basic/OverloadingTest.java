package com.techlabs.basic;

public class OverloadingTest {

	public static void main(String[] args) {
		System.out.println("Java");
		
		printThis("hello");
		printThis(10);
		printThis(10.54);
		printThis(10.56f);
		printThis('#');
		
	}
	
	public static void  printThis(int n) {
		
		 System.out.println("integer value is "+n);
	}
	public static void printThis(double n) {
		System.out.println("double value is "+n);
	}
	public static void printThis(float n) {
		System.out.println("float value is "+n);
	}
	public static void printThis(String n) {
		System.out.println("String value is "+n);
	}
	public static void printThis(char n) {
		System.out.println("char value is "+n);
	}

}
