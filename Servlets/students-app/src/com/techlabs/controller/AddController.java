package com.techlabs.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.model.Student;

@WebServlet("/add")
public class AddController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AddController() {
        super();
        System.out.println("Inside addController");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside addGET");
		String name=request.getParameter("Name");
		double cgpi=Double.parseDouble(request.getParameter("Cgpi"));
		Student newStudent=new Student(name,cgpi);
		StudentService studentService=new StudentService();
		studentService.add(newStudent);
		
//		if(name!=null||name.equals(""))
			
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside addPOST");
		doGet(request,response);
		response.sendRedirect("/students-app/students");
	}

}
