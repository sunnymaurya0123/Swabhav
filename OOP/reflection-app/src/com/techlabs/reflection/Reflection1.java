package com.techlabs.reflection;

import java.lang.reflect.*;

public class Reflection1 {

	int methodCount, constructorCount, setterCount, getterCount;
	Method[] methodList ;
	Constructor<?>[] constructor ;

	public Reflection1(Class<?> string)  {

		methodList=string.getDeclaredMethods();
		constructor=string.getConstructors();
	}


	String s ="sunny";
	
	public void printMethods() {
		for (Method method : methodList) {
			methodCount = methodCount + 1;
			System.out.println("Method names: " + method.getName());
			if (method.getName().contains("get"))
				getterCount = getterCount + 1;
			if (method.getName().contains("set"))
				setterCount = setterCount + 1;
		}
	}

	public void printConstructors() {
		for (Constructor<?> constructors : constructor) {
			System.out.println("Constructor names: " + constructors.getName());
			constructorCount = constructorCount + 1;
		}
	}

	public void printInto() {
		System.out.println(
				"Total number of methods: " + methodCount + "\nTotal number of constructors: " + constructorCount
						+ "\nTotal number of getters: " + getterCount + "\nTotal number of setters: " + setterCount);
	}

}
