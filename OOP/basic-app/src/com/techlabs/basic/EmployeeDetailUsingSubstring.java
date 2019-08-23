package com.techlabs.basic;

public class EmployeeDetailUsingSubstring {

	public static void main(String[] args) {
		String x=args[0];
		System.out.println(x.length());
		System.out.println("Company: "+x.substring(x.indexOf(".")+1,x.indexOf("c")-1));
		if(x.contains("?")) {
			System.out.println("Name: "+x.substring(x.indexOf("=")+1, x.indexOf("&")));
		}
		
		if(x.contains("&")) {
			System.out.println("Location: "+x.substring(x.indexOf("location")+9));
		}
		//http://www.aurionpro.com?developer=sunny&location=rabale
	}

}
