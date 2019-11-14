package com.techlabs.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlabs.entity.Student;
import com.techlabs.service.StudentService;

public class StudentAction implements Action{

	@Autowired
	StudentService service;
	@Override
	public String execute() throws Exception {
		System.out.println("Inside execute");
		System.out.println(service.get().size());
		
		List<Student> list=service.get();
		for(int i=0;i<service.get().size();i++) {
			Student student=(Student) list.get(i);
			System.out.println("Name: "+student.getName()+" RollNo: "+student.getRollNo()
					+" Cgpi: "+student.getCgpi());
		}
		
		return this.SUCCESS;
	}

}
