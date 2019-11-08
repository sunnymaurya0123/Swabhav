package com.techlabs.action;

import com.opensymphony.xwork2.Action;

public class WishAction implements Action{

	private String userName;
	private String message;
	@Override
	public String execute() throws Exception {
		System.out.println("Inside wish execute");
		return this.SUCCESS;
	}
	
	public String doExecute() throws Exception {
		System.out.println("Inside wish doExecute");
		if(userName!="") {
		message="Struts wishes hello to "+userName;
		return this.SUCCESS;
		}
		return this.ERROR;
	}

	public String getMessage() {
		return message;
	}

	public void setUserName(String userName) {
		System.out.println("Inside setusername");
		this.userName = userName;
	}
	
	
}
