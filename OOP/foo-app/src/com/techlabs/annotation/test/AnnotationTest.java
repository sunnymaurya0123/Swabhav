package com.techlabs.annotation.test;

import java.lang.reflect.Method;

import com.techlabs.annotation.NeedRefactor;
import com.techlabs.foo.Foo;

public class AnnotationTest {
	static int annotationCount;
	public static void main(String[] args) {
		Class<?> classobject=Foo.class;
		Method[] methodList=classobject.getDeclaredMethods();
		for(Method method:methodList) {
			increementAnnotationCount(method);
		}
		System.out.println("Total number of methods which needs to be refactor are: "+annotationCount);

	}
	static void increementAnnotationCount(Method method) {
		if(method.isAnnotationPresent(NeedRefactor.class)) {
			annotationCount++;
		}
	}

}
