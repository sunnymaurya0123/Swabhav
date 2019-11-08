package com.techlabs.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.opensymphony.xwork2.Action;

public class GreetAction implements Action{
	private String message;
	
	public String getMessage() {
		return message;
	}


	@Override
	public String execute() throws Exception {
		System.out.println("Inside execute");
		message=getGreetTime();
		return this.SUCCESS;
	}
	
	public String getGreetTime(){
		Date date=new Date();
		SimpleDateFormat dateFormat=new SimpleDateFormat("HH");
		int hour=Integer.parseInt(dateFormat.format(date));
		System.out.println(hour);
		if(hour<12)
			message="Good Morning";
		if(hour>12)
			message="Good Afternoon";
		return message;
	}
	
	public String doExecute() {
		System.out.println("Inside doExecute");
		message=getGreetTime();
		return this.SUCCESS;
	}
}
