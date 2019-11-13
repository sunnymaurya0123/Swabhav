package com.techlabs.action;

import com.opensymphony.xwork2.Action;

public class StudentAction implements Action{

	@Override
	public String execute() throws Exception {
		System.out.println("Inside execute");
		return this.SUCCESS;
	}

}
