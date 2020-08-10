package com.shivam.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class profilePageServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		
		String user_key = (String) request.getSession().getAttribute("user_key");
		
		if(user_key.contentEquals("A1B2C3D4G5H6I7J8K9")) {
			out.println("Login Successful, redirecting to profile page!<br>");
			String user_name = "John Wick!!!!!";
			session.setAttribute("user_name", user_name);
			response.sendRedirect("profilePage.jsp");
		}else {
			out.println("No existing session found! You didn't login it seems!");
		}
		
	}
	
}
