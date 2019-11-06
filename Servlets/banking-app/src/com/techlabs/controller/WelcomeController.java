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

@WebServlet("/welcome")
public class WelcomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public WelcomeController() {
        super();
        System.out.println("Inside Welcome Controller");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside Welcome GET");
		BankService bankService = BankService.getInstance();
		HttpSession session=request.getSession();
		String userName=(String)session.getAttribute("userName");
		double userBal=bankService.getUserBalance(userName);
		System.out.println(userBal);
		session.setAttribute("userBal", userBal);
		RequestDispatcher view = request.getRequestDispatcher("Views/welcome.jsp");
		view.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside Welcome POST");
	}

}
