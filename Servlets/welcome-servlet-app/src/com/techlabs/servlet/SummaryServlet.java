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
 * Servlet implementation class SummaryServlet
 */
@WebServlet("/summary")
public class SummaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SummaryServlet() {
		super();
		System.out.println("Inside summaryServlet");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Inside summaryGET");
		HttpSession session = request.getSession();
		ServletContext application = getServletConfig().getServletContext();
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>\r\n" + "<html>\r\n" + "\r\n" + "<head>\r\n" + "    <title>\r\n"
				+ "        Summary\r\n" + "    </title>\r\n" + "</head>\r\n" + "\r\n" + "<body>\r\n"
				+ "    <form style=\"padding-left: 500px; background-color: green;\" method=\"POST\" action=\"summary.jsp\">\r\n"
				+ "        <br><label style=\"color: yellow;\">Latest Session Counter: ");
		out.println(session.getAttribute("counter"));
		out.println("</label><br><br>\r\n" + "        <label style=\"color: yellow;\">Latest Application Counter: ");
		out.println(application.getAttribute("counter"));
		out.println("</label><br><br>\r\n" + "    </form>\r\n" + "\r\n" + "</body>\r\n" + "\r\n" + "</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Inside summaryPOST");
		doGet(request, response);
	}

}
