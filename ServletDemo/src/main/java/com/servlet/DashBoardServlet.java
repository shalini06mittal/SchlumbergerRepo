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
 * S1 S2 ... S100 =>  authentication/ authorization..
 * Filters => interrupt the req and the response
 * logging..
 * 
 * 
 */
@WebServlet("/dashboard")
public class DashBoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DashBoardServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("do get dashboard");
		// if i am logged in
		String email = request.getParameter("email");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.print("<h1>Response from GET- DASHBOARD</h1>");
		out.print("<p>Welcome "+email+"</h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		String email = request.getParameter("email");
//		System.out.println("do post dashboard");
//		PrintWriter out = response.getWriter();
//		response.setContentType("text/html");
//		out.print("<h1>Response from post- DASHBOARD</h1>");
//		out.print("<p>Welcome "+email +"</h1>");
//	}

}
