<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile Page</title>
</head>
<body>

<% 
	
	String user_name = (String)session.getAttribute("user_name");
	if(user_name == null){
		response.sendRedirect("takeInput.html");
	}else{
		
%>
	<h1><br><br>

<% 
		out.println("Welcome to Profile Page - "+user_name);
	}
	
%>
	</h1>
</body>
</html>