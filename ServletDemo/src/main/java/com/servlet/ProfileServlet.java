package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DashBoardServlet
 * 
 * images => compression
 * password => encrypt
 * authentication => 100 servlets
 * S1 S2 ... S100 =>  
 * 
 * 
 */
@WebServlet("/profile")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfileServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// if i am logged in
		System.out.println("do get dashboard");
		String email = request.getParameter("email");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.print("<h1>Response from GET- DASHBOARD</h1>");
		out.print("<p>Welcome "+email+"</h1>");
	}

	

}
