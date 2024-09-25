package com.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/readoperation")
public class ReadOperation extends HttpServlet{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String roll = request.getParameter("rollnumber");
		int rollno = Integer.valueOf(roll);
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlets", "root", "iesbpl@2024");
			
			PreparedStatement ps = con.prepareStatement("SELECT *FROM student WHERE roll_no=?");
			ps.setInt(1, rollno);
			
			ResultSet rs = ps.executeQuery();
			
			ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
			int total = rsmd.getColumnCount();
			
			out.print("<tr>");  
			for(int i=1;i<=total;i++)  
			{  
				out.print("<th>"+rsmd.getColumnName(i)+"</th>");  
			}  
			  
			out.print("</tr>");  
			              
			/* Printing result */  
			  
			while(rs.next())  
			{  
				out.print("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td></tr>"+rs.getString(5)+"</td></tr>");                 
			}  
			  
			out.print("</table>");   
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		finally{
			out.close();
		} 
	}
}
