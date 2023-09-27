package com.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class LogFilter
 */
//@WebFilter({"/dashboard", "/profile", "/login"})
public class LogFilter extends HttpFilter implements Filter {
       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public LogFilter() {
        System.out.println("Log Filter constructor");
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("Log Filter destroy");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse)response;
		System.out.println("Log Filter before do filter chain "+req.getContextPath());
		System.out.println("Email "+req.getParameter("email"));
		String email = req.getParameter("email");
		if( ! email.endsWith("gmail.com"))
		{
			resp.sendRedirect("login.jsp?error=invalid");
			
		}
		else {
		// pass the request along the filter chain
			chain.doFilter(request, response);
			System.out.println("Log Filter after do filetr chain");
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("Log Filter init");
		// log file => log_date_time
	}

}
