package com.techlabs.reflection;

import com.techlabs.reflection.*;
import java.lang.reflect.*;

import com.techlabs.reflection.Reflection;

public class Reflection1 {

	static int methodCount, constructorCount, setterCount, getterCount;
	private String str;
	public Reflection1(String string) {
		this.str=string;
	}

	Class<?> classobject =str.getClass();
	Method[] methodList = classobject.getDeclaredMethods();
	Constructor<?>[] constructor = classobject.getConstructors();

	public void getTheMethods() {
		for (Method method : methodList) {
			methodCount = methodCount + 1;
			System.out.println("Method names: " + method.getName());
			if (method.getName().contains("get"))
				getterCount = getterCount + 1;
			if (method.getName().contains("set"))
				setterCount = setterCount + 1;
		}
	}

	public void getTheConstructors() {
		for (Constructor<?> constructors : constructor) {
			System.out.println("Constructor names: " + constructors.getName());
			constructorCount = constructorCount + 1;
		}
	}

	static void printInto() {
		System.out.println(
				"Total number of methods: " + methodCount + "\nTotal number of constructors: " + constructorCount
						+ "\nTotal number of getters: " + getterCount + "\nTotal number of setters: " + setterCount);
	}

}
