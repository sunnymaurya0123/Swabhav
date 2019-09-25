package com.techlabs.factory;

 class BMW implements IAuto{

	@Override
	public void start() {
		System.out.println("BMW started");
		
	}

	@Override
	public void stop() {
		System.out.println("BMW stopped");
		
	}

}
