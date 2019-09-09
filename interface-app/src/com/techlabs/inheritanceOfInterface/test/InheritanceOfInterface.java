package com.techlabs.inheritanceOfInterface.test;

interface Homework{
	void homework();
}

interface Classwork{
	void classwork();
}

interface Totalwork extends Homework,Classwork{
	void assignments();
}

class Student implements Totalwork{

	@Override
	public void homework() {
		System.out.println("HomeWork Done!!!");
	}

	@Override
	public void classwork() {
		System.out.println("ClassWork Done!!!");
	}

	@Override
	public void assignments() {
		System.out.println("Assignments Done!!!");
	}
	
	public void totalwork() {
		homework();
		classwork();
		assignments();
		System.out.println("Totalwork Completed!!!!!!");
	}
	
}

public class InheritanceOfInterface {

	public static void main(String[] args) {
		Student student=new Student();
		student.totalwork();
	}

}
