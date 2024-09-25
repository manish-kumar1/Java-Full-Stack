package com.java.servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		int fn = Integer.parseInt(request.getParameter("firstno"));
		int sn = Integer.parseInt(request.getParameter("secondno"));
		
		int sum = fn + sn;
		
		request.setAttribute("Add", sum);
		
		RequestDispatcher rd = request.getRequestDispatcher("servlet2");
		rd.forward(request, response);
		
		
	}
}
