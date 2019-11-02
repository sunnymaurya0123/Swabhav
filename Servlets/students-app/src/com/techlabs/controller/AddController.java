package com.techlabs.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.model.Student;
import com.techlabs.service.StudentService;

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
		String number=request.getParameter("Cgpi");
		String validationMesssage="";
		
		if((!name.equals(null) && !name.equals("")) && (!number.equals(null) && !number.equals(""))){
			double cgpi=Double.parseDouble(number);
			Student newStudent=new Student(name,cgpi);
			StudentService studentService=StudentService.getInstance();
			studentService.add(newStudent);
			response.sendRedirect("/students-app/students");
		}
		else {
			validationMesssage="* All Fields are mandatory";
			request.setAttribute("validate", validationMesssage);
			request.setAttribute("inputName", name);
			request.setAttribute("inputCgpi", number);
			RequestDispatcher view = request.getRequestDispatcher("add.jsp");
			view.forward(request, response);
			//response.sendRedirect("/students-app/add.jsp");
		}
			
	}
	
	public static boolean isNumeric(String str)
	{
	    for (char c : str.toCharArray())
	    {
	        if (!Character.isDigit(c)) 
	        	return false;
	    }
	    return true;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside addPOST");
		doGet(request,response);
	}

}
