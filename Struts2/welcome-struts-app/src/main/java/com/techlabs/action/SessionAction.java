package com.techlabs.action;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;

public class SessionAction implements SessionAware,Action{

	private int prevCount;
	private int newCount;
	private int counter;
	
	private SessionMap<String,Object> sessionMap;
	@Override
	public String execute() throws Exception {
		
		System.out.println("Inside session execute");
		if(sessionMap.get("counter") == null)
			counter=0;
		else
			counter=(int) sessionMap.get("counter");
		prevCount=counter;
			++counter;
		newCount=counter;
		sessionMap.put("counter", counter);
		return this.SUCCESS;
	}

	@Override
	public void setSession(Map<String, Object> map) {
		sessionMap=(SessionMap<String, Object>) map;
		System.out.println(sessionMap);
	}

	public int getPrevCount() {
		return prevCount;
	}

	public void setPrevCount(int prevCount) {
		this.prevCount = newCount;
	}

	public int getNewCount() {
		return newCount;
	}

	public void setNewCount(int newCount) {
		this.newCount = newCount;
	}

}
