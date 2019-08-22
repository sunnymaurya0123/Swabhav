package com.techlabs.basic;

public class PassByValueTest {

	public static void main(String[] args) {
		int mark=100;
		int marks[]= {10,20,30,40};
		changeMarkToZero(marks);
		for(int m:marks)
			System.out.println(m);
		changeMarkToZero(mark);
		System.out.println(mark);

	}
	
	 static void changeMarkToZero(int parameter){
		parameter=0;
	}
	 static void changeMarkToZero(int[] parameter) {
		 for(int i=0;i<parameter.length;i++)
			 parameter[i]=0;
	 }

}
