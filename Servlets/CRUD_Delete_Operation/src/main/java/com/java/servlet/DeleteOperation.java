package com.java.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/emplogin")
public class DeleteOperation extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		String eml = request.getParameter("email");
		String pass = request.getParameter("epassword");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlets", "root", "iesbpl@2024");
			
			PreparedStatement ps = con.prepareStatement("DELETE FROM employee WHERE email=? AND password=?");
			ps.setString(1, eml);
			ps.setString(2, pass);
			
			int count = ps.executeUpdate();
			if(count > 0) {
				System.out.println("Successfully deletion..");
			}
			else {
				System.out.println("Deletion failed...");
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
