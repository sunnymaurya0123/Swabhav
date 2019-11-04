package com.techlabs.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter(value= {"/application","/session"})
public class LogFilter implements Filter {

    public LogFilter() {
        System.out.println("Inside LogFilter");
    }

	public void destroy() {
		System.out.println("Inside destroy");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest reqst=(HttpServletRequest) request;
		System.out.println(reqst.getRequestURI());
		Date date=new Date();
		long dateBefore=date.getTime();
		System.out.println("Start Time : "+ date.toLocaleString());

		chain.doFilter(request, response);
		
		System.out.println("End Time : "+ new Date().toLocaleString());
		System.out.println("Time Difference: "+(new Date().getTime()-dateBefore)+" ms");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("Inside init");
	}

}
