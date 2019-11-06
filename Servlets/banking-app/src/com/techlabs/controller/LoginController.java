package com.techlabs.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.service.BankService;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public LoginController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside Login GET");
		RequestDispatcher view = request.getRequestDispatcher("Views/login.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside Login POST");
		
		BankService bankService = BankService.getInstance();
		String userName=(String) request.getParameter("username");
		String password=(String) request.getParameter("password");
		
//		String userBalance=bankService.getUserBalance();
//		String openBal=request.getParameter("");
		
		if(bankService.validate(userName,password)) {
			HttpSession session=request.getSession();
			session.setAttribute("userName", userName);
			session.setAttribute("welcomeUser", "Welcome "+userName);
			response.sendRedirect("/banking-app/welcome");
		}
		else {
			request.setAttribute("errorMsg", "Invalid UserName or Password!!!");
			RequestDispatcher view = request.getRequestDispatcher("Views/login.jsp");
			view.forward(request, response);
		}
	}

}
