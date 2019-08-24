package com.techlabs.circle.test;

import com.techlabs.circle.BorderCategory;
import com.techlabs.circle.Circle;

public class CircleTest {

	public static void main(String[] args) {
		Circle circle=new Circle();
		circle.setRadius(2.5f);
		circle.setBorderstyle(BorderCategory.DOUBLE);
		
		Circle temp;
		temp=circle;
		
		temp.setRadius(5.5f);
		System.out.println(temp.getRadius());
		System.out.println(circle.getRadius());
		
		System.out.println("Area of Anonymous Object: "+new Circle().getArea());
		printInto(circle);
		printInto(new Circle());
	}
	static void printInto(Circle c) {
		System.out.println(c.getRadius());
		System.out.println(c.getArea());
		System.out.println(c.getBorderstyle());
	}

}
