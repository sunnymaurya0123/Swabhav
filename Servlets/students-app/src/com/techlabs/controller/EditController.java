package com.techlabs.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.model.Student;

/**
 * Servlet implementation class EditController
 */
@WebServlet("/edit")
public class EditController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public EditController() {
        super();
        System.out.println("Inside EditController");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside editGET");
		String validationMesssage="";
		StudentService studentService=StudentService.getInstance();
		
		String name=request.getParameter("Name");
		String number=request.getParameter("Cgpi");
		int studentId=Integer.parseInt(request.getParameter("id"));
		
		Student student=studentService.get(studentId);
		
		request.setAttribute("studentID", studentId);
		request.setAttribute("inputName", student.getName());
		request.setAttribute("inputCgpi", ""+student.getCgpi());
		RequestDispatcher view = request.getRequestDispatcher("edit.jsp");
		view.forward(request, response);
		
		System.out.println(studentId);

		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside editPOST");
		String validationMesssage="";
		
		String name=request.getParameter("Name");
		String number=request.getParameter("Cgpi");
		int studentId=Integer.parseInt(request.getParameter("id"));
		StudentService studentService=StudentService.getInstance();
		if((!name.equals(null) && !name.equals("")) && (!number.equals(null) && !number.equals(""))){
			double cgpi=Double.parseDouble(number);
			System.out.println(cgpi);
			studentService.edit(studentId, new Student(name,cgpi));
			response.sendRedirect("/students-app/students");
		}
		else {
			validationMesssage="* All Fields are mandatory";
			request.setAttribute("studentID", studentId);
			request.setAttribute("validate", validationMesssage);
			request.setAttribute("inputName", name);
			request.setAttribute("inputCgpi", number);
			
			RequestDispatcher view = request.getRequestDispatcher("edit.jsp");
			view.forward(request, response);
		}
		
	}

}
