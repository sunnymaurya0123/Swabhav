package com.techlabs.controller;

import java.io.IOException;
import java.sql.Date;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.model.BankMaster;
import com.techlabs.model.BankTransaction;
import com.techlabs.service.BankService;

@WebServlet("/register")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegisterController() {
		super();
		System.out.println("Inside Register Controller");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Inside Register GET");
		RequestDispatcher view = request.getRequestDispatcher("Views/register.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Inside Register POST");

		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		String rePassword = request.getParameter("repassword");
		String openBalance = request.getParameter("openbalance");
		boolean checkNumber = openBalance.matches("\\d+(\\.\\d+)?");
		String validationMesssage = "";

		if ((!userName.equals(null) && !userName.equals(""))
				&& (!password.equals(null) && !password.equals("") && (!rePassword.equals(null)
						&& !rePassword.equals("") && checkNumber && password.equals(rePassword)))) {
			double openBal = Double.parseDouble(openBalance);
			BankMaster bankMaster = new BankMaster(userName, password, openBal);
			BankTransaction bankTransaction = new BankTransaction(userName, openBal, "D", new Date(Calendar.getInstance().getTime().getTime()));
			BankService bankService = BankService.getInstance();
			bankService.addAccount(bankMaster, bankTransaction);
			response.sendRedirect("/banking-app/login");
		} else {
			validationMesssage = "* All Fields are mandatory";
			request.setAttribute("validate", validationMesssage);
			request.setAttribute("inputUserName", userName);
			RequestDispatcher view = request.getRequestDispatcher("/Views/register.jsp");
			view.forward(request, response);
		}
	}
}
