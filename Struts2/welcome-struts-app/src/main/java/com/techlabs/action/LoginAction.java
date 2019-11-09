package com.techlabs.action;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {

	private String userName;
	private String password;
	private String message;
	private SessionMap<String,Object> sessionMap;
	
	@Override
	public void setSession(Map<String, Object> map) {
		sessionMap=(SessionMap<String, Object>) map;
	}

	@Override
	public void validate() {
		System.out.println("Inside validate");
		if (userName.trim().equals("") || userName==null)
			addFieldError("userName", "userName can't be blank.");
		if(password.trim().equals("") || password==null)
			addFieldError("password", "password can't be blank.");
	}

	@Override
	public String execute() {
		System.out.println("Inside login execute");
		if (userName.equals("Sunny") && password.equals("maurya")) {
			message="welcome "+userName;
			sessionMap.put("login", true);
			sessionMap.put("userName", userName);
			return this.SUCCESS;
		}
		return this.ERROR;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
