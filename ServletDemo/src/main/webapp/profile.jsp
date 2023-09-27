<%@page import="com.entities.Customer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">

	div{
		padding:40px;
		width:70%;
		margin:0 auto;
		background-color: maroon;
		color:white;
	}
</style>
</head>
<body>

	<%
	Customer customer = (Customer) request.getAttribute("customer");
	%>
	<h1>Profile of <%=customer.getEmail()%></h1>
	<div>
		<p>Firstname : <%= customer.getFristname() %></p>
		<p>Lastname : <%= customer.getLastname() %></p>
		<p>City : <%= customer.getCity() %></p>
		<p>Country : <%= customer.getCountry() %></p>
		<p>Phone : <%= customer.getPhone() %></p>
	</div>

</body>
</html>