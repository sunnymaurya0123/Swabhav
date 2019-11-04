package com.techlabs.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@WebFilter(value = { "/add", "/edit", "/delete" })
public class Interceptor implements Filter {

	public Interceptor() {
		System.out.println("Inside Filter Interceptor");
	}

	public void destroy() {
		System.out.println("Inside Interceptor destroy");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Inside doFilter");
		HttpServletRequest reqst = (HttpServletRequest) request;
		HttpSession session = reqst.getSession();
		System.out.println(reqst.getRequestURI());
		String currentUser = (String) session.getAttribute("userName");
		if (currentUser != null && !currentUser.equals("")) {
			chain.doFilter(request, response);
		} else {
			RequestDispatcher view = request.getRequestDispatcher("login.jsp");
			view.forward(request, response);
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("Inside init");
	}

}
