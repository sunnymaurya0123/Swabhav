package com.techlabs.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.model.BankTransaction;
import com.techlabs.service.BankService;

@WebServlet("/passbook")
public class PassbookController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	List<BankTransaction> passbookList;
	
    public PassbookController() {
        super();
        System.out.println("Inside Passbook Controller");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside Passbook GET");
		HttpSession session=request.getSession();
		String userName=(String) session.getAttribute("userName");
		BankService bankService=BankService.getInstance();
		passbookList= bankService.get(userName);
		request.setAttribute("passbooklist", passbookList);
	
		RequestDispatcher view = request.getRequestDispatcher("Views/passbook.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside Passbook POST");
		
		response.setContentType("text/csv");
	    response.setHeader("Content-Disposition", "attachment; filename=\"passbook.csv\"");
	    try
	    {
	        OutputStream outputStream = response.getOutputStream();
	        String outputResult = "";
	        for(BankTransaction bankTransaction: passbookList)
	        outputResult = outputResult+bankTransaction.getName()+","+bankTransaction.getAmount()+","+bankTransaction.getType()+","+bankTransaction.getDate()+"\n";
	        outputStream.write(outputResult.getBytes());
	        outputStream.flush();
	        outputStream.close();
	    }
	    catch(Exception e)
	    {
	       e.printStackTrace();
	    }
		
	}

}
