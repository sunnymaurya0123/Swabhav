package com.techlabs.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.model.Student;
import com.techlabs.service.StudentService;

@WebServlet("/students")
public class StudentsController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public StudentsController() {
        super();
    }
    
    public void init(ServletConfig config) throws ServletException {
    	super.init(config);
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentService studentService=StudentService.getInstance();
		List<Student> list= studentService.get();
		request.setAttribute("studentlist", list);
		RequestDispatcher view = request.getRequestDispatcher("students.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
