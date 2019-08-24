package com.techlabs.rectangle;

public class Rectangle {
	
	private int width;
	private int height;
	private ColorCategory color;
	
	private final int MIN_VALUE=0;
	private final int MAX_VALUE=100;
	private static int widthCount;
	
	
	public Rectangle(int width,int height,ColorCategory color) {
		this.color=color;	
		this.width=checkRange(width);
		this.height=checkRange(height);
		
	}
	
	public ColorCategory getColor() {
		return color;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	private int checkRange(int constant) {
		if(constant>MAX_VALUE)
			return MAX_VALUE;
		else if (constant<MIN_VALUE)
			return MIN_VALUE;
		else if(constant>=MIN_VALUE && constant<=MAX_VALUE)
			return constant;
		return 0;
	}

	public int calculateArea() {

		return width * height;
	}

}
