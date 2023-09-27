package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.db.CustomerDatabase;
import com.entities.Customer;

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
		HttpSession session = request.getSession();
		String email = (String)session.getAttribute("email");
		CustomerDatabase db = new CustomerDatabase();
		try {
			Customer customer = db.getCustomerByEmail(email);
			RequestDispatcher dispatcher = request.getRequestDispatcher("profile.jsp");
			request.setAttribute("customer", customer);
			dispatcher.forward(request, response);
//			PrintWriter out = response.getWriter();
//			response.setContentType("text/html");
//			out.println("<p><a href='dashboard'>Dashboard</a>&nbsp;&nbsp;"
//					+ "<a href='invoices'>Invoices</a>&nbsp;&nbsp"
//					+ "<a href='logout'>Logout</a></p>");
//			out.print("<h1>Response from GET- PROFILE</h1>");
//			out.print("<p>Welcome "+email+"</h1>");
//			out.print("<p>Welcome profile here</h1>");
//			out.println(customer);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//String email = request.getParameter("email");
		
	}

	

}
