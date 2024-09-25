package com.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		int fn = Integer.parseInt(request.getParameter("firstno"));
		int sn = Integer.parseInt(request.getParameter("secondno"));
		
		int sum = (int) request.getAttribute("Add");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println(sum);
		out.println(fn*sn);
	}

}
