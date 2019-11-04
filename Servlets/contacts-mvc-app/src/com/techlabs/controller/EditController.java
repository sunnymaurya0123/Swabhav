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

/**
 * Servlet implementation class EditController
 */
@WebServlet("/edit")
public class EditController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("Inside editGET");
		ContactService contactService = ContactService.getInstance();

		int contactId = Integer.parseInt(request.getParameter("id"));

		Contact contact = contactService.get(contactId);

		request.setAttribute("contactID", contactId);
		request.setAttribute("inputFirstName", contact.getFirstName());
		request.setAttribute("inputLastName", contact.getLastName());
		request.setAttribute("inputEmailId", contact.getEmailId());
		request.setAttribute("inputPhoneNo", contact.getPhoneNo());
		RequestDispatcher view = request.getRequestDispatcher("editContact.jsp");
		view.forward(request, response);

		System.out.println(contactId);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Inside editPOST");

		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		String emailId = request.getParameter("emailid");
		String phoneNo = request.getParameter("phoneno");
		String validationMesssage = "";

		int contactId = Integer.parseInt(request.getParameter("id"));
		System.out.println("contactId" + contactId);
		ContactService contactService = ContactService.getInstance();
		if ((!firstName.equals(null) && !firstName.equals("")) && (!lastName.equals(null) && !lastName.equals("")
				&& (!emailId.equals(null) && !emailId.equals("") && (!phoneNo.equals(null) && !phoneNo.equals(""))))) {
			contactService.edit(contactId, new Contact(firstName, lastName, emailId, phoneNo));
			response.sendRedirect("/contacts-mvc-app/contacts");
		} else {
			validationMesssage = "* All Fields are mandatory";
			request.setAttribute("contactID", contactId);
			request.setAttribute("validate", validationMesssage);
			request.setAttribute("inputFirstName", firstName);
			request.setAttribute("inputLastName", lastName);
			request.setAttribute("inputEmailId", emailId);
			request.setAttribute("inputPhoneNo", phoneNo);

			RequestDispatcher view = request.getRequestDispatcher("editContact.jsp");
			view.forward(request, response);
		}

	}

}
