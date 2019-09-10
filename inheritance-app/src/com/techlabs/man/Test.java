package com.techlabs.man;

public class Test {

	public static void main(String[] args) {
		//caseStudy1();
		//caseStudy2();
		//caseStudy3();
		//caseStudy4();
		caseStudy5();

	}

	static void caseStudy1() {
		Man x;
		x=new Man();
		x.read();
		x.play();
		
	}

	static void caseStudy2() {
		Boy y;
		y=new Boy();
		y.read();
		y.walk();
		y.play();
		
	}

	static void caseStudy3() {
		Man x;
		x=new Boy();
		x.read();
		x.play();
		
		
		
	}

	static void caseStudy4() {
		atThePark(new Man());
		atThePark(new Boy());
		atThePark(new Kid());
		atThePark(new Infant());
		
	}

	static void atThePark(Man x) {
		System.out.println("At the Park");
		x.play();
		
	}

	static void caseStudy5() {
		Object x;
		x=10;
		System.out.println(x.getClass());
		x="hello";
		System.out.println(x.getClass());
		x=new Man();
		System.out.println(x.getClass());
		
	}

}
