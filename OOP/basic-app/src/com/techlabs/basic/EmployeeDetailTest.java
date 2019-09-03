package com.techlabs.basic;

public class EmployeeDetailTest {

	public static void main(String[] args) {
		System.out.println(args.length);
		String x=args[0];
		System.out.println(x.length());
		String[] result=x.split("\\.");
		System.out.println("company: "+result[1]);
		
		if(result[2].contains("?")) {
		String x1[]=result[2].split("=");
		//System.out.println(result[2]);
		//System.out.println(x1[0]);
		
		
		if(x1[1].contains("&")) {
			String[] x2=x1[1].split("\\&");
			System.out.println("location: "+x1[2]);
			System.out.println("name: "+x2[0]);
		}
		else
			System.out.println("name: "+x1[1]);
		}
		//System.out.println("name: "+x2[0]);
		//System.out.println(x2[1]);
		
		//System.out.println(result[0]);
//		for(String token:result)
//			System.out.println(token);
		System.out.println();
//		for(int i=11;i<56;i++) {
//			if(x.charAt(i)=='.') {
//				System.out.println();
//				continue;
//			}
//			System.out.print(x.charAt(i));
//			if(x.charAt(i)=='=') {
//				System.out.println();
//			}
//			if(x.charAt(i)=='&') {
//				System.out.println();
//				continue;
//			}
//		}
		
		
	}

}
