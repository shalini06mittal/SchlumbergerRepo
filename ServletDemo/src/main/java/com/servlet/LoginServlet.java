package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db.CustomerDatabase;

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
		System.out.println("destroy of login servlet");
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

		CustomerDatabase db = new CustomerDatabase();
		try {
			String pwd = db.findCustomerByEmail(email);
			System.out.println("pwd "+pwd);
			if(password.equals(pwd)) {
//				RequestDispatcher dispatcher = request.getRequestDispatcher("/dashboard");
//				dispatcher.forward(request, response);
				//URL Rewriting
				response.sendRedirect("dashboard?email="+email);
			}
			else
				response.sendRedirect("login.jsp?error=password");
		} catch (Exception e) {
			response.sendRedirect("login.jsp?error=email");
		}
	}
}
