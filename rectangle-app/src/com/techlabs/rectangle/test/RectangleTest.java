package com.techlabs.rectangle.test;

import com.techlabs.rectangle.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle smallrectangle = new Rectangle();
		smallrectangle.setWidth(101);
		smallrectangle.setHeight(3);
		smallrectangle.setColor("yellow");
		System.out.println("width: "+smallrectangle.getWidth());
		System.out.println("height: "+smallrectangle.getHeight());
		System.out.println("color: "+smallrectangle.getColor());
		System.out.println("Small Rectangle Area is: "+smallrectangle.calculateArea());
		
		Rectangle bigRectangle=new Rectangle();
		bigRectangle.setWidth(80);
		bigRectangle.setHeight(20);
		bigRectangle.setColor("BlUe");
		System.out.println("width: "+bigRectangle.getWidth());
		System.out.println("height: "+bigRectangle.getHeight());
		System.out.println("color: "+bigRectangle.getColor());
		System.out.println("Big Rectangle Area is: "+bigRectangle.calculateArea());
		
//		smallrectangle.width=10;
//		smallrectangle.height=5;
//		System.out.println("width: "+smallrectangle.width);
//		System.out.println("height: "+smallrectangle.height);
//		System.out.println("Small Rectangle Area is: "+smallrectangle.calculateArea());
//		
//		Rectangle bigRectangle=new Rectangle();
//		bigRectangle.width=50;
//		bigRectangle.height=20;
//		System.out.println("width: "+bigRectangle.width);
//		System.out.println("height: "+bigRectangle.height);
//		System.out.println("Big Rectangle Area is: "+bigRectangle.calculateArea());

	}

}
