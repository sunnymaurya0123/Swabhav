package com.example.web;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.example.model.BeerExpert;

@WebServlet("/beerselect")
public class BeerSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public BeerSelect() {
        super();
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		out.println("Beer Selection Advice<br>");
		
		String c = request.getParameter("color");
		BeerExpert be = new BeerExpert();
		List result = be.getBrands(c);
		
		request.setAttribute("styles", result);
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request, response);
		
//		out.println("<br>Got beer color " + c);
		
//		Iterator it = result.iterator();
//		while(it.hasNext()) {
//		out.print("<br>try: " + it.next());
//		}
	}

}
