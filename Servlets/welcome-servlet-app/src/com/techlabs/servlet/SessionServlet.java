package com.techlabs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionServlet
 */
@WebServlet("/session")
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SessionServlet() {
		super();
		System.out.println("Inside sessionServlet");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Inside sessionGET");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>\r\n" + "<html>\r\n" + "\r\n" + "<head>\r\n" + "    <title>\r\n"
				+ "        Session\r\n" + "    </title>\r\n" + "</head>\r\n" + "\r\n" + "<body>");
		int count;
		HttpSession session = request.getSession();
		if (session.getAttribute("counter") == null)
			count = 0;
		else
			count = (Integer) session.getAttribute("counter");
		int prevCount = count;
		count = count + 1;
		session.setAttribute("counter", count);
		out.println(
				"<form style=\"padding-left: 500px; background-color: green;\" method=\"POST\" action=\"session.jsp\">\r\n"
						+ "        <br><label style=\"color: yellow;\">Session Id:");
		out.println(session.getId());
		out.println("</label><br><br>\r\n" + "        <label style=\"color: yellow;\">Old:");
		out.println(prevCount);
		out.println("</label><br><br>\r\n" + "        <label style=\"color: yellow;\">New:");
		out.println(count);
		out.println(
				"<br><br><a style=\"color: yellow;\" href=\"http://localhost:8080/welcome-servlet-app/summary\">Summary</a><br><br></label><br><br></form>\r\n"
						+ "\r\n" + "</body>\r\n" + "\r\n" + "</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Inside sessionPOST");
		doGet(request, response);
	}

}
