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
 * Servlet implementation class GetCookieServlet
 */
@WebServlet("/getcookie")
public class GetCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GetCookieServlet() {
		super();
		System.out.println("Inside getCookieServlet");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Inside getCookieGET");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>\r\n" + "<html>\r\n" + "\r\n" + "<head>\r\n" + "    <title>\r\n"
				+ "        Set Cookies\r\n" + "    </title>\r\n" + "</head>\r\n" + "\r\n" + "<body>");
		Cookie cookie = null;
		Cookie[] cookies = null;
		cookies = request.getCookies();
		String colour;
		if (cookies != null) {
			out.println("<h2> Cookies Found </h2>");

			for (int i = 0; i < cookies.length; i++) {
				cookie = cookies[i];
				if (cookie.getName().equals("color")) {
					out.print("Name : " + cookie.getName() + ",  ");
					out.print("Value: " + cookie.getValue() + " <br/>");
					colour = cookie.getValue();
					out.println("<body style='background-color:" + colour + " '></body>");
					break;
				}
			}
		} else
			out.println("<h2>No cookies founds</h2>");
		out.println("</body>\r\n" + "</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Inside getCookiePOST");
		doGet(request, response);
	}

}
