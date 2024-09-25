package com.java.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateOperationServlet{

	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlets", "root", "iesbpl@2024");
			
			PreparedStatement ps = con.prepareStatement("UPDATE employee SET name=?, email=? WHERE password=?");
			ps.setString(1, "Manish");
			ps.setString(2, "manish@gmail.com");
			ps.setString(3, "maister123");
			
			int count = ps.executeUpdate();
			if(count > 0) {
//				out.println("<h2>Updation successfully...</h2>");
				System.out.println("Updation successfully...");
			}
			else {
//				out.println("<h2>Updation failed due to some error</h2>");
				System.out.println("Updation failed due to some error");
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
