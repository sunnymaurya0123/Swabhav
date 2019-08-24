package com.techlabs.rectangle;

public class Rectangle {
	private int width;
	private int height;
	private String color;
	private final int MIN_VALUE=0;
	private final int MAX_VALUE=100;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		color=color.toLowerCase();
		System.out.println(color);
		if (((!color.equals("red") && (!color.equals("blue")) && (!color.equals("green")))))
			this.color = "red";
		else
			this.color = color;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void setWidth(int width) {
		this.width=checkRange(width);
	}

	public void setHeight(int height) {
		this.height=checkRange(height);
		
	}
	
	public int checkRange(int constant) {
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
