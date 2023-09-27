package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DashBoardServlet
 * 
 * images => compression
 * password => encrypt
 * authentication => 100 servlets
 * S1 S2 ... S100 =>  authentication/ authorization..
 * Filters => interrupt the req and the response
 * logging..
 * 
 * 
 */
@WebServlet("/invoices")
public class InvoicesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InvoicesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String email = (String)session.getAttribute("email");
		//String email = request.getParameter("email");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<p><a href='profile'>Profile</a>&nbsp;&nbsp;"
				+ "<a href='dashboard'>Dashboard</a>&nbsp;&nbsp"
				+ "<a href='logout'>Logout</a></p>");
		out.print("<h1>Response from GET- INVOICES</h1>");
		out.print("<p>Invoices of "+email+"</h1>");
	}

	

}
