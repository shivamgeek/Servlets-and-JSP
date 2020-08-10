package com.shivam.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public loginServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user = request.getParameter("username");
		String pass = request.getParameter("password");
		PrintWriter out = response.getWriter();
		out.println("doGET invoked!!<br>");
		
		String user_metadata = "A1B2C3D4G5H6I7J8K9";
		
		if(user.equals("s")) {
			out.println("Login Successful, redirecting to profile page!<br>");
			
			HttpSession session = request.getSession();
			session.setAttribute("user_metadata", user_metadata);
			session.setAttribute("user_name", user);
			
			response.sendRedirect("profilePageServlet");
		}
		else {
			out.println("Invalid Credentials !!<br>");
			response.sendRedirect("takeInput.html");
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("doPOST invoked!!<br>");
		doGet(request, response);
	}

}
