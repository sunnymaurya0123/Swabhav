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
		if (((color != "red") && (color != "blue")) && (color != "green"))
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
		if (width > 100)
			this.width = 100;
		else if (width < 0)
			this.width = 0;
		else if (width >= 0 && width <= 100)
			this.width = width;
	}

	public void setHeight(int height) {
		if (height > 100)
			this.height = 100;
		else if (height < 0)
			this.height = 0;
		else if (height >= 0 && height <= 100)
			this.height = height;
		else if (height >= 0 && height <= 100)
			this.height = height;
	}

	public int calculateArea() {

		return width * height;
	}

}
