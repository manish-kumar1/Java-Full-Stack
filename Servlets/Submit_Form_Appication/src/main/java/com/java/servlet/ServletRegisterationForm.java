package com.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/register")
public class ServletRegisterationForm extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("user_name");
		String email = request.getParameter("user_email");
		String password = request.getParameter("user_password");
		String gender = request.getParameter("gender");
		String course = request.getParameter("courses");
		
		out.print("<h2>Name: "+name+"</h2>");
		out.print("<h2>Email: "+email+"</h2>");
		out.print("<h2>Password: "+password+"</h2>");
		out.print("<h2>Gender: "+gender+"</h2>");
		out.print("<h2>Course: "+course+"</h2>");
		
	}

}
