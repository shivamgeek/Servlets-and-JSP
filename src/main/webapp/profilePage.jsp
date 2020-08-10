<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile Page</title>
</head>
<body>

<!-- 
Built-in Objects in JSP - 

1. request - HttpServletRequest
2. response - HttpServletResponse
3. pageContext - PageContext
4. out - PrintWriter
5. session - HttpSession
6. application -  ServletContext
7. config - ServletConfig

 -->



<!--  
DIRECTIVE TAG -  Used to import packages in the converted Servlet file
-->

<%@ page import="java.util.List, java.util.LinkedList" %>


<!-- Declaration TAG - Declared variables and functions are kept outside the service method ie class members, unlike normal scriptlet code. -->
<%!
	int var = 0;
	
	int findSquare(int a){
		var = a;
		List<Integer> al = new LinkedList<Integer>();
		System.out.println("value of var is "+var*var);
		return var*var;
	}
%>

<h1>

<!-- SCRIPTLET TAG  - Used to put java code, which goes inside "service" method of Servlet -->
<% 
	
	String user_name = (String)session.getAttribute("user_name");
	if(user_name == null){
		response.sendRedirect("takeInput.html");
	}else{
		out.println("Welcome to Profile Page - "+user_name);
	}
%>
</h1>


<br><br>


<!-- EXPRESSION TAG - used to print values directly without using PrintWriter "out" object  -->
<h3> Square value is <%= findSquare(7) %></h3>


</body>
</html>