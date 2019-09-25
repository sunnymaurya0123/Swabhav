package com.techlabs.factory;

public class TeslaFactory implements IAutoFactory{

	private static TeslaFactory singleton;
	
	private TeslaFactory() {
		
	}
	
	public static TeslaFactory getInstance(){
		if(singleton==null)
			singleton=new TeslaFactory();
		return singleton;
	}

	@Override
	public IAuto make() {
		
		return new Tesla();
	}
}
