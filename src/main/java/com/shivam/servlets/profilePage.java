package com.shivam.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class profilePage extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		String user = request.getParameter("username");
		String user_metadata = (String) request.getAttribute("user_metadata");
		out.println("Welcome to Profile Page - "+user);
		out.println("User Metadata is "+user_metadata);
	}
	
}
