package com.techlabs.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside LoginGET");
		RequestDispatcher view = request.getRequestDispatcher("login.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside LginPOST");
		String userName=(String) request.getParameter("username");
		String password=(String) request.getParameter("password");
		
		if(validate(userName,password)) {
			HttpSession session=request.getSession();
			session.setAttribute("userName", userName);
			session.setAttribute("welcomeUser", "Welcome "+userName);
			response.sendRedirect("/contacts-mvc-app/contacts");
		}
		else {
			request.setAttribute("errorMsg", "Invalid UserName or Password!!!");
			RequestDispatcher view = request.getRequestDispatcher("login.jsp");
			view.forward(request, response);
		}
	}

	private boolean validate(String userName, String password) {
		String dummyUserName="Admin";
		String dummyPassword="admin";
		
		if(userName.equals(dummyUserName)&&password.equals(dummyPassword))
			return true;
		return false;
	}

}
