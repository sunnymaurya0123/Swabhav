package com.techlabs.dataservice;

public class DataService {
	private static DataService bucket;
	private DataService() {
		System.out.println("Inside DataService");
	}
	
	public static DataService getInstance(){
		if(bucket==null)
			bucket=new DataService();
		return bucket;
	}
	
	public void doSomething() {
		System.out.println("Work done by "+this.hashCode());
	}
}
