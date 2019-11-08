package com.techlabs.action;

import com.opensymphony.xwork2.Action;

public class HomeAction implements Action {

	public HomeAction() {
		System.out.println("Inside Constructor");
	}
	private String developer;
	
	@Override
	public String execute() throws Exception {
		System.out.println("Inside execute");
		return this.SUCCESS;
	}

	public void setDeveloper(String developer) {
		System.out.println("setter Injection");
		this.developer = developer;
	}

	public String getDeveloper() {
		System.out.println("Inside Get Developer");
		return developer;
	}
	
	
	
}
