package com.techlabs.automobile;

public class AutomobileFactory {
	
	private static AutomobileFactory singleton;
	
	private AutomobileFactory() {
		
	}
	
	public static AutomobileFactory getInstance() {
		if(singleton==null)
			singleton=new AutomobileFactory();
		return singleton;
	}
	
	public IAutomobile make(AutoType autoType) {
		switch (autoType) {
		case BMW:
			return new BMW();
		case AUDI:
			return new Audi();
		case TESLA:
			return new Tesla();
		default:
			return null;
		}
	}
}
