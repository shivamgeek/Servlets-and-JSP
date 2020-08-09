package com.shivam.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		
		if(user.equals("s")) {
			RequestDispatcher rd = request.getRequestDispatcher("profilePage");
//			request.setAttribute("user_metadata", "<SOME USER DATA FETCHED FROM THE DATABASE>");
//			rd.forward(request, response);
			response.sendRedirect("profilePage");
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("takeInput.html");
			rd.forward(request, response);
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("doPOST invoked!!<br>");
		doGet(request, response);
	}

}
