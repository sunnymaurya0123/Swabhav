package com.techlabs.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.model.Contact;
import com.techlabs.service.ContactService;

@WebServlet("/add")
public class AddController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddController() {
		super();
		System.out.println("Inside Add Controller");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Inside Add GET");
		RequestDispatcher view = request.getRequestDispatcher("addContacts.jsp");
		view.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Inside Add POST");

		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		String emailId = request.getParameter("emailid");
		String phoneNo = request.getParameter("phoneno");
		String validationMesssage = "";

		if ((!firstName.equals(null) && !firstName.equals("")) && (!lastName.equals(null) && !lastName.equals("")
				&& (!emailId.equals(null) && !emailId.equals("") && (!phoneNo.equals(null) && !phoneNo.equals(""))))) {
			Contact newContact = new Contact(firstName, lastName, emailId, phoneNo);
			ContactService contactService = ContactService.getInstance();
			contactService.add(newContact);
			response.sendRedirect("/contacts-mvc-app/contacts");
		} else {
			validationMesssage = "* All Fields are mandatory";
			request.setAttribute("validate", validationMesssage);
			request.setAttribute("inputFirstName", firstName);
			request.setAttribute("inputLastName", lastName);
			request.setAttribute("inputEmailId", emailId);
			request.setAttribute("inputPhoneNo", phoneNo);
			RequestDispatcher view = request.getRequestDispatcher("addContacts.jsp");
			view.forward(request, response);
			// response.sendRedirect("/students-app/add.jsp");
		}
	}
}
