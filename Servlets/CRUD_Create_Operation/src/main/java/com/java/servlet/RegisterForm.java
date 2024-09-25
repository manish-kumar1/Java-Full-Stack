package com.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/register")
public class RegisterForm extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("ename");
		String email = request.getParameter("eemail");
		String password = request.getParameter("epassword");
		String gender = request.getParameter("gender");
		String country = request.getParameter("country");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlets", "root", "iesbpl@2024");
			
			PreparedStatement ps = con.prepareStatement("INSERT INTO employee VALUES(?,?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, password);
			ps.setString(4, gender);
			ps.setString(5, country);
			
			int count = ps.executeUpdate();
			if(count > 0) {
				out.print("<h3 style='color: green'>Registeration successfully...</h3>");
			}
			else {
				out.print("<h3 style='color: red'>Registeration failed...</h3>");
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
