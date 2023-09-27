package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * IOC = inversion of control
 * Servlet implementation class LoginServlet
 * 
 * Allows to write HTML code within the java code
 * 
 * Servletes as Controller => Takes the request => communicates with underlying BL(service layer)
 * and gives the response to JSP file to display the content
 * 
 * Model => Customer
 * JSP as Views => Display the UI
 * 
 * MVC 
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor. 
	 */
	public LoginServlet() {
		System.out.println("Login Servlet Constructor");
	}

	@Override
	public void destroy() {
		System.out.println("destrou of login servlet");
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("do get called");
		response.sendRedirect("login.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("do post called");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		if(email.equals("admin")) {
			if(password.equals("admin")) {
				out.print("<h1>Response from post</h1>");
				out.print("<p>Welcome "+email+" Your password is : "+ password +"</h1>");
			}
			else {
				// invalid credentials
				response.sendRedirect("login.jsp?error=password");
			}

		}
		else {
			// User deos not exist with that email , Please register
			response.sendRedirect("login.jsp?error=email");
		}
	}

}
