package com.techlabs.circle;

public class Circle {
	private float radius;
	private BorderCategory borderstyle;
	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	public BorderCategory getBorderstyle() {
		return borderstyle;
	}
	public void setBorderstyle(BorderCategory borderstyle) {
		this.borderstyle = borderstyle;
	}
	public float getArea() {
		return calculateArea(radius);
	}
	 float calculateArea(float radius) {
		return (float)Math.PI*radius*radius;
	}
	
}
