package com.techlabs.factory;

public class AudiFactory implements IAutoFactory{

	private static AudiFactory singleton;
	
	private AudiFactory() {
		
	}
	
	public static AudiFactory getInstance(){
		if(singleton==null)
			singleton=new AudiFactory();
		return singleton;
	}
	
	@Override
	public IAuto make() {
		
		return new Audi();
	}
	
}
