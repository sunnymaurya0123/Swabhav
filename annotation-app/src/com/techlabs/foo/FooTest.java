package com.techlabs.foo;

import java.lang.reflect.Method;

import com.techlabs.unittest.UnitTest;

public class FooTest {
	static int annotationCount;
	static int pass;
	static int fail;
	static int trueCount;
	static int falseCount;
	static Class<?> classobject=Foo.class;
	public static void main(String[] args) {
		
		Method[] methodList=classobject.getDeclaredMethods();
		for(Method method:methodList) {
			increementAnnotationCount(method);
		}
		System.out.println(annotationCount);
		System.out.println(trueCount);
		System.out.println(falseCount);
//		Foo foo=new Foo();
//		increementResultCount(foo);

	}
	
	static void increementAnnotationCount(Method method) {
		if(method.isAnnotationPresent(UnitTest.class)) {
			//if(method.invoke(classobject))
				trueCount++;
			//else
				falseCount++;
			annotationCount++;
		}
	}
//	static void increementResultCount(Foo foo) {
//		if(foo.m1())
//			pass++;
//	}

}
