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
import javax.servlet.http.HttpSession;

import com.techlabs.model.BankTransaction;
import com.techlabs.service.BankService;

@WebServlet("/transaction")
public class TransactionController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public TransactionController() {
        super();
        System.out.println("Inside Transaction Controller");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside Transaction GET");
		RequestDispatcher view = request.getRequestDispatcher("Views/transaction.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside Transaction POST");
		HttpSession session=request.getSession();
		
		String transactionType= request.getParameter("transaction");
		String amount = request.getParameter("amount");
		
		boolean checkNumber = amount.matches("\\d+(\\.\\d+)?");
		
		String userName=(String) session.getAttribute("userName");
		System.out.println(transactionType);
		
		BankService bankService=BankService.getInstance();
		if(checkNumber) {
			double openBal = Double.parseDouble(amount);
			BankTransaction bankTransaction = new BankTransaction(userName, openBal,transactionType, new Date(Calendar.getInstance().getTime().getTime()));
			bankService.updateAccount(bankTransaction);
			response.sendRedirect("/banking-app/welcome");
		}else {
			RequestDispatcher view = request.getRequestDispatcher("/Views/transaction.jsp");
			view.forward(request, response);
		}
	}

}
