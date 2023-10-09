<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<ul>
	<li><a href='logout'>Logout</a></li>
</ul>
<h1>Customer dashBoard</h1>

<p> FirstName : ${customer.firstname }</p>
<p> LastName : ${customer.lastname }</p>
<p> Phone : ${customer.phone }</p>
</body>
</html>