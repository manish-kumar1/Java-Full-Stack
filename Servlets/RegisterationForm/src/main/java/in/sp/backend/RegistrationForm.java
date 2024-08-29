package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/RegistrationForm")

public class RegistrationForm extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("user_name");
		String email = request.getParameter("user_email");
		String password = request.getParameter("user_password");
		String cpassword = request.getParameter("confirm_password");
		
//		out.println("<h2>Name: "+name+" </h2>");
//		out.println("<h2>Email: "+email+"</h2>");
//		out.println("<h2>Password: "+password+" </h2>");
//		out.println("<h2>Confirm Password: "+cpassword+"</h2>");
//		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlets", "root", "manish");
			
			PreparedStatement ps = con.prepareStatement("INSERT INTO registerform VALUES(?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, password);
			ps.setString(4, cpassword);	
			
			int count = ps.executeUpdate();
			if(count > 0) {
				
				
				response.setContentType("text/html");
				out.print("<h3 style='color: green; margin-bottom: 585px; margin-right:-324px' > User registered successfully </h3>");
				RequestDispatcher rd = request.getRequestDispatcher("/index.html");
				rd.include(request, response);
			}
			else {
				response.setContentType("text/html");
				out.print("<h3 style='color: red'> User not registered due to some error</h3>");
				RequestDispatcher rd = request.getRequestDispatcher("/index.html");
				rd.include(request, response);
			}
		}
		catch(Exception e) {
			
			e.printStackTrace();
			response.setContentType("text/html");
			out.print("<h3 style='color: red'>Exception Occured : "+e.getMessage()+"</h3>");
			RequestDispatcher rd = request.getRequestDispatcher("/index.html");
			rd.include(request, response);
		}
		
		
	}

}
