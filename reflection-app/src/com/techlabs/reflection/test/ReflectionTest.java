package com.techlabs.reflection.test;

import java.lang.reflect.*;

import com.techlabs.reflection.Reflection;

public class ReflectionTest {
	
	static int methodCount, constructorCount, setterCount, getterCount;
	public static void main(String[] args) {
		
		
		Class<?> classobject=Object.class;
		Method[] methodList=classobject.getDeclaredMethods();
		Constructor<?>[] constructor=classobject.getConstructors();
		
		for(Method method:methodList) {
			methodCount=methodCount+1;
			System.out.println("Method names: "+method.getName());
			if(method.getName().contains("get"))
				getterCount=getterCount+1;
			if(method.getName().contains("set"))
				setterCount=setterCount+1;
		}
		for(Constructor<?> constructors:constructor) {
			System.out.println("Constructor names: "+constructors.getName());
			constructorCount=constructorCount+1;
		}
		
		printInto();

	}
	static void printInto() {
		System.out.println("Total number of methods: "+methodCount+
				"\nTotal number of constructors: "+constructorCount+
				"\nTotal number of getters: "+getterCount+
				"\nTotal number of setters: "+setterCount);
	}

}
