<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>
		<a href='index.jsp'>Home Page</a>
	</h3>
	<%-- JSP is Java in HTML code JSP comments --%>
	<!-- <h1>Please Login - GET Sample</h1>
	<form action="login" method="GET">
		<div>Email : <input type='text' name="email" /></div>
		<div>Password : <input type='password' name="password"/></div>
		<div><input type='submit'/></div>
	</form> -->
	<%-- <% 
		String error = request.getParameter("error");
		System.out.println("error "+error);
		if(error !=null) {
			if(error.equals("email")){
				out.println("<p>Email does not exist , Please Register</p>");
			out.println("<div><a href='register'>Register</a></div>");
			}
			if(error.equals("password")){
				out.println("<p>Invalid Credentials</p>");
			}
		}
	%> --%>

	<%
	String error = request.getParameter("error");
	System.out.println("error " + error);
	if (error != null) {
		if (error.equals("email")) {
	%>
	<p>Email does not exist , Please Register</p>
	<div>
		<a href='register'>Register</a>
	</div>
	<%
	}
	if (error.equals("password")) {
	%>
	<p>Invalid Credentials</p>
	<%
	}
	}
	%>
	<h1>Please Login - POST Sample</h1>
	<form action="login" method="POST">
		<div>
			Email : <input type='text' name="email" />
		</div>
		<div>
			Password : <input type='password' name="password" />
		</div>
		<div>
			<input type='submit' value='Login' />
		</div>
	</form>
</body>
</html>