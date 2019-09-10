package com.techlabs.foo;

import java.lang.reflect.Method;

import com.techlabs.unittest.UnitTest;

public class FooTest {
	static int annotationCount;
	static int pass;
	static int fail;
	public static void main(String[] args) {
		Class<?> classobject=Foo.class;
		Method[] methodList=classobject.getDeclaredMethods();
		for(Method method:methodList) {
			increementAnnotationCount(method);
		}
		System.out.println(annotationCount);
		Foo foo=new Foo();
		increementResultCount(foo);

	}
	
	static void increementAnnotationCount(Method method) {
		if(method.isAnnotationPresent(UnitTest.class))
			annotationCount++;
	}
	static void increementResultCount(Foo foo) {
		if(foo.m1())
			pass++;
	}

}
