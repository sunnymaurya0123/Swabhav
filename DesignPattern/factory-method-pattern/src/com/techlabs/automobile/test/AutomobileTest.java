package com.techlabs.automobile.test;

import java.io.IOException;

import com.techlabs.factory.IAuto;
import com.techlabs.factory.IAutoFactory;
import com.techlabs.factory.PropertyFileLoader;
import java.lang.reflect.*;

public class AutomobileTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		IAutoFactory factory=reflectProperty();
		IAuto auto=factory.make();
		auto.start();
		auto.stop();
		System.out.println(factory.hashCode());
		IAutoFactory factory1=reflectProperty();
		System.out.println(factory.hashCode());

	}

	private static IAutoFactory reflectProperty() throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		PropertyFileLoader p=new PropertyFileLoader();
		Class cls=Class.forName(p.getproperties());
		Method method = cls.getMethod("getInstance");
		Object o = method.invoke(cls);
		return  (IAutoFactory) o;
	}

}
