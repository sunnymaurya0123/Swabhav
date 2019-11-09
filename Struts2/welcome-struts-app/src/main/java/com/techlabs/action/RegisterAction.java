package com.techlabs.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.model.RegisterViewModel;

public class RegisterAction extends ActionSupport implements SessionAware,ModelDriven<RegisterViewModel> {

	RegisterViewModel model;
	
	public RegisterAction() {
		System.out.println("Inside Constructor");
		model=new RegisterViewModel();
	}
	
	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void validate() {
		System.out.println("Inside validate");
		if (model.getName().trim().equals("") || model.getName()==null)
			addFieldError("name", "name can't be blank.");
		if(model.getEmail().trim().equals("") || model.getEmail()==null)
			addFieldError("email", "email can't be blank.");
		if(model.getPhoneNo().trim().equals("") || model.getPhoneNo()==null)
			addFieldError("phoneNo", "phoneNo can't be blank.");
	}

	@Override
	public RegisterViewModel getModel() {
		// TODO Auto-generated method stub
		return model;
	}
	
}
