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
	<h1>Please Login</h1>
	<form action="login" method="GET">
		<div>Email : <input type='text' name="email" /></div>
		<div>Password : <input type='password' name="password"/></div>
		<div><input type='submit'/></div>
	</form>
</body>
</html>