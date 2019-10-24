package com.techlabs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ApplicationServlet
 */
@WebServlet("/application")
public class ApplicationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ApplicationServlet() {
        super();
        System.out.println("Inside applicationServlet");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside applicationGET");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"\r\n" + 
				"<head>\r\n" + 
				"    <title>\r\n" + 
				"        Application\r\n" + 
				"    </title>\r\n" + 
				"</head>\r\n" + 
				"\r\n" + 
				"<body>");
		int count;
		ServletContext application = getServletConfig().getServletContext();
		HttpSession session = request.getSession();
		if (application.getAttribute("counter") == null)
			count = 0;
		else
			count = (Integer) application.getAttribute("counter");
		int prevCount = count;
		count = count + 1;
		application.setAttribute("counter", count);
		out.println(
				"<form style=\"padding-left: 500px; background-color: green;\" method=\"POST\" action=\"session.jsp\">\r\n"
						+ "        <br><label style=\"color: yellow;\">Session Id:");
		out.println(session.getId());
		out.println("</label><br><br>\r\n" + "        <label style=\"color: yellow;\">Old:");
		out.println(prevCount);
		out.println("</label><br><br>\r\n" + "        <label style=\"color: yellow;\">New:");
		out.println(count);
		out.println("</label><br><br></form>\r\n" + "\r\n" + "</body>\r\n" + "\r\n" + "</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside applicationPOST");
		doGet(request, response);
	}

}
