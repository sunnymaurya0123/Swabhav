package com.techlabs.rectangle.test;

import com.techlabs.rectangle.ColorCategory;
import com.techlabs.rectangle.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle smallrectangle = new Rectangle();
		System.out.println(ColorCategory.BLUE.toString());
		System.out.println(smallrectangle.getColor());

		System.out.println("width: " + smallrectangle.getWidth() + " height: " + smallrectangle.getHeight() + " color: "
				+ smallrectangle.getColor() + " Small Rectangle Area is: " + smallrectangle.calculateArea());

		Rectangle bigRectangle = new Rectangle();
		bigRectangle.setColor("GREEN");
		System.out.println("width: " + bigRectangle.getWidth() + " height: " + bigRectangle.getHeight() + " color: "
				+ bigRectangle.getColor() + " Big Rectangle Area is: " + bigRectangle.calculateArea());

	}

}
