package com.techlabs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SetCookieServlet
 */
@WebServlet("/setcookie")
public class SetCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SetCookieServlet() {
		super();
		System.out.println("Inside setCookieServlet");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Inside setCookieGET");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>\r\n" + "<html>\r\n" + "\r\n" + "<head>\r\n" + "    <title>\r\n"
				+ "        Set Cookies\r\n" + "    </title>\r\n" + "</head>\r\n" + "\r\n" + "<body>");
		Cookie colorCookie = new Cookie("color", "red");
		colorCookie.setMaxAge(60 * 60 * 24 * 7);
		response.addCookie(colorCookie);
		out.println("<form method=\"POST\" action=\"setcookies.jsp\">\r\n"
				+ "        <p>Cookies Created Successfully</p>\r\n"
				+ "        <a href=\"http://localhost:8080/welcome-servlet-app/getcookie\">View Cookies</a>\r\n"
				+ "    </form>\r\n" + "</body>\r\n" + "</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Inside setCookiePOST");
		doGet(request, response);
	}

}
