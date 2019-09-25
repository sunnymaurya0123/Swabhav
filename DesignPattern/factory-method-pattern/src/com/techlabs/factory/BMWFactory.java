package com.techlabs.factory;

public class BMWFactory implements IAutoFactory{

	private static BMWFactory singleton;
	
	private BMWFactory() {
		
	}
	
	public static BMWFactory getInstance(){
		if(singleton==null)
			singleton=new BMWFactory();
		return singleton;
	}

	@Override
	public IAuto make() {
		// TODO Auto-generated method stub
		return new BMW();
	}
	
}
