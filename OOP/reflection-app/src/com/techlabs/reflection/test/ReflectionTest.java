package com.techlabs.reflection.test;

import java.io.*;
import java.lang.annotation.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectionTest {
	
	static int methodCount, constructorCount, setterCount, getterCount, annotationCount;
	public static void main(String[] args) {
		
		Class<?> classobject=String.class;
		Method[] methodList=classobject.getDeclaredMethods();
		Constructor<?>[] constructor=classobject.getConstructors();
		Annotation annotation[]=classobject.getAnnotations();
		
		for(Method method:methodList) {
			methodCount=methodCount+1;
			System.out.println("Method names: "+method.getName());
			if(method.isAnnotationPresent(Deprecated.class))
				annotationCount++;
			if(method.getName().contains("get"))
				getterCount=getterCount+1;
			if(method.getName().contains("set"))
				setterCount=setterCount+1;
		}
		for(Constructor<?> constructors:constructor) {
			System.out.println("Constructor names: "+constructors.getName());
			constructorCount=constructorCount+1;
		}
		for(Annotation annotations:annotation) {
			System.out.println("Annotations: "+annotations);
			annotationCount=annotationCount+1;
			
		}
		System.out.println("Annotation: "+annotation);
		printInto();

	}
	
	static void printInto() {
		System.out.println("Total number of methods: "+methodCount+
				"\nTotal number of constructors: "+constructorCount+
				"\nTotal number of getters: "+getterCount+
				"\nTotal number of setters: "+setterCount+
				"\nTotal number of annotations: "+annotationCount);
	}

}
