<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Please Login</h1>
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