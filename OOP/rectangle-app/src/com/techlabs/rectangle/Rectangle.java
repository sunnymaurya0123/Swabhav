package com.techlabs.rectangle;

public class Rectangle {
	private int width;
	private int height;
	private String color;

	
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
		if(constant>Constant.MAX_VALUE)
			return Constant.MAX_VALUE;
		else if (constant<Constant.MIN_VALUE)
			return Constant.MIN_VALUE;
		else if(constant>=Constant.MIN_VALUE && constant<=Constant.MAX_VALUE)
			return constant;
		return 0;
	}

	public int calculateArea() {

		return width * height;
	}

}
