package com.java.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/userLogin")
public class LoginPage extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
		
		String email = request.getParameter("eml");
		String password = request.getParameter("psw");
		
		Cookie ck = new Cookie("key_eml", email);
		Cookie ck2 = new Cookie("key_psw", password);
		response.addCookie(ck);
		response.addCookie(ck2);
		
		response.sendRedirect("profile");
	}

}
