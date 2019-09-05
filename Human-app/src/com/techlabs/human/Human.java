package com.techlabs.human;

public class Human {
	private String name;
	private float height;
	private float weight;
	private int age;
	private GenderCategory gender;
	private static int count;
	
	static {
		count=100;
		System.out.println("Static Block");
	}
	
	public Human() {
		System.out.println("Constructor Block");
		
	}
	
	public Human(String name, float height, float weight, int age, GenderCategory gender) {
		count++;
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.gender = gender;
		
	}

	public Human(String name, int age) {
		this(name, 5, 50, age, GenderCategory.MALE);
	}

	public void eat() {
		this.weight = weight + 0.5f;
	}

	public void play() {
		this.weight = weight - 0.10f;
		this.height = height + 0.01f;
	}

	public String getName() {
		return name;
	}

	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}

	public int getAge() {
		return age;
	}

	public GenderCategory getGender() {
		return gender;
	}
	
	public int getCount() {
		return count;
	}
	
	public static int headCount() {
		return count;
	}

}
