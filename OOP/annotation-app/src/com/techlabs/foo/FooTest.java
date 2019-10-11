package com.techlabs.foo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.techlabs.unittest.UnitTest;

public class FooTest {
	private static int annotationCount;
	private static int trueCount;
	private static int falseCount;
	private static Class<?> classobject=Foo.class;
	private static Foo fooObj=new Foo();
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Method[] methodList=classobject.getDeclaredMethods();
		for(Method method:methodList) {
			increementAnnotationCount(method);
		}
		
		System.out.println("Number of Annotations: "+annotationCount);
		System.out.println("Test Passed: "+trueCount);
		System.out.println("Test failed: "+falseCount);
	}
	
	static void increementAnnotationCount(Method method) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		if(method.isAnnotationPresent(UnitTest.class)) {
			
				boolean booleanValue=(Boolean)method.invoke(fooObj);
				increementResult(booleanValue);
			
			annotationCount++;
		}
	}
	
	static void increementResult(boolean booleanValue) {
		if(booleanValue==true)
			trueCount++;
		else
			falseCount++;
	}

}
