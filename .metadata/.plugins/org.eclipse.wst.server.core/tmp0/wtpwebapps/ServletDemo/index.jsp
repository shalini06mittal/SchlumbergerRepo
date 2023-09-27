<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>hello</h1>
	<%
		String email = (String)session.getAttribute("email");
		if(email == null){
	%>
	<div>
		<a href='login.jsp'>Login</a>
	</div>
	<div>
		<a href='register.jsp'>Register</a>
	</div>
	<% 
	}else{
	%>
	<div>
		<a href='logout'>Logout</a>
	</div>
	<%} %>
	<!-- http://localhost:8080/ServletDemo/index.jsp
 -->
</body>
</html>