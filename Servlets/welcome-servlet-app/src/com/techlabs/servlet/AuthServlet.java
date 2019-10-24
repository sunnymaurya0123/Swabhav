package com.techlabs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AuthServlet
 */
@WebServlet("/auth")
public class AuthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AuthServlet() {
		super();
		System.out.println("Inside AuthServlet");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Inside AuthGET");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>\r\n" + "<html>\r\n" + "    <head>\r\n" + "        <title>\r\n"
				+ "            Authentic\r\n" + "        </title>\r\n" + "    </head>\r\n" + "    <body>");
		String userName = request.getParameter("username");
		String passwords = request.getParameter("password");

		String admin = "admin";
		if (userName.equals(admin) && passwords.equals(admin))
			out.println("Authentication Successful" + "<br> Hello " + userName);
		else {
			out.println("Authentication Failed <br>");
			out.println("<a href='login.html'>Login again</a>");
		}
		out.println("    </body>\r\n" + "</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Inside AuthPOST");
		doGet(request,response);
	}

}
