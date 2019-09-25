package com.techlabs.automobile.test;

import com.techlabs.automobile.AutoType;
import com.techlabs.automobile.AutomobileFactory;
import com.techlabs.automobile.IAutomobile;

public class AutomobileTest {

	public static void main(String[] args) {
		AutomobileFactory factory = AutomobileFactory.getInstance();
		IAutomobile auto = factory.make(AutoType.AUDI);
		auto.start();
		auto.stop();
		System.out.println(auto.getClass());
		

	}

}
