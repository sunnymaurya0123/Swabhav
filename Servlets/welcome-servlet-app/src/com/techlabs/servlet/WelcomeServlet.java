package com.techlabs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public WelcomeServlet() {
		super();
		System.out.println("Inside Servlet");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Inside GET");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>\r\n" + "<html>\r\n" + "    <head>\r\n" + "        <title>\r\n"
				+ "            Welcome Page\r\n" + "        </title>\r\n" + "    </head>\r\n"
				+ "    <body style=\"background-color: khaki\">\r\n" + "        <h1>");
		out.print("Welcome to Servlet");
		out.print("</h1>\r\n" + "        \r\n");
		String name = request.getParameter("developer");
		if (name != "")
			for (int i = 0; i < 5; i++)
				out.println(name + "<br>");
		else
			for (int i = 0; i < 5; i++)
				out.println("Welcome to Servlet<br>");
		out.println("    </body>\r\n");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Inside POST");
	}

}
