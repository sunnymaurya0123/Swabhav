package com.techlabs.rectangle.test;

import com.techlabs.rectangle.ColorCategory;
import com.techlabs.rectangle.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		
		int sum=0;

		Rectangle[] rectangles=new Rectangle[5];
		rectangles[0]=new Rectangle(50,20,ColorCategory.BLUE);
		rectangles[1]=new Rectangle(60,30,ColorCategory.RED);
		rectangles[2]=new Rectangle(30,40,ColorCategory.GREEN);
		rectangles[3]=new Rectangle(20,10,ColorCategory.BLUE);
		rectangles[4]=new Rectangle(5,10,ColorCategory.RED);
		
		int max=rectangles[0].calculateArea();
		
		for(Rectangle rectangle:rectangles) {
			printInto(rectangle);
			sum=sum+rectangle.calculateArea();
			if(rectangle.calculateArea()>max)
				max=rectangle.calculateArea();
		}
		System.out.println("Sum of Areas: "+sum);
		System.out.println("Bigger Rectangle is: "+max);
	}
	
	static void printInto(Rectangle rectangle) {
		System.out.println("width: "+rectangle.getWidth()+" height: "+rectangle.getHeight()+" Color: "+rectangle.getColor()+
				" Rectangle area is: "+rectangle.calculateArea());
	}
}
