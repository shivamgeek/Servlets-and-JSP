package com.shivam.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class profilePage extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		
		String user = (String) request.getSession().getAttribute("user_name");
		
		if(user == null) {
			out.println("No existing session found");
		}else {
			String user_metadata = (String) request.getSession().getAttribute("user_metadata");
			out.println("<html><body bgcolor = 'yellow'>");
			out.println("Welcome to Profile Page - "+user);
			out.println("<br>USER METADATA IS "+user_metadata);
			out.println("</body><html>");
		}
		
	}
	
}
