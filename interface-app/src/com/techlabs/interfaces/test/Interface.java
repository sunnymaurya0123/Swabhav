package com.techlabs.interfaces.test;

interface HomeWork {
	void homeWork();
}

 class Student implements HomeWork{

	@Override
	public void homeWork() {
		System.out.println("HomeWork Done!!!");
	}

}

public class Interface {

	public static void main(String[] args) {
		Student student=new Student();
		student.homeWork();
	}

}
