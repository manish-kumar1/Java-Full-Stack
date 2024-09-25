<%@ page import="in.sp.model.UserInfo" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <!-- Adjust the package name accordingly --->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%
		UserInfo user = (UserInfo) session.getAttribute("session_user");

	%>
		<h2 style='color: green'>Welcome to your profile page</h2>
	
	<h3>Name : <%= user.getName() %></h3>
	<h3>Email : <%= user.getEmail() %></h3>
	<h3>Gender : <%= user.getGender() %></h3>
	<h3>City : <%= user.getCity() %></h3>
	
	<a href="logout">Logout</a>
	
	
</body>
</html>