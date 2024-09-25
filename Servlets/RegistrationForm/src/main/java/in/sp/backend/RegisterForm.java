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

@WebServlet("/register")
public class RegisterForm extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		if(!(name.trim().length() <= 3)) {
			out.println("User name is not valid");
			return;
		}
		String email = request.getParameter("email");
		String pass = request.getParameter("password");
		String gender = request.getParameter("gender");
		String dob = request.getParameter("dob");
		String mobile = request.getParameter("mobile");
		String course = request.getParameter("course");
		String country = request.getParameter("country");
		String degree = request.getParameter("degree");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlets", "root", "iesbpl@2024");
			PreparedStatement ps = con.prepareStatement("INSERT INTO registerform VALUES(?,?,?,?,?,?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, pass);
			ps.setString(4, gender);
			ps.setString(5, dob);
			ps.setString(6, mobile);
			ps.setString(7, course);
			ps.setString(8, country);
			ps.setString(9, degree);
			
			int count = ps.executeUpdate();
			if(count > 0) {
				response.setContentType("text/html");
				out.println("<h3 style='color: green'> User registered successfully </h3>");
				RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
				rd.include(request, response);
			}
			else {
				response.setContentType("text/html");
				out.println("<h3 style='color: red'> User not registered due to some error </h3>");
				RequestDispatcher rd = request.getRequestDispatcher("/index.html");
				rd.include(request, response);
			}
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
			response.setContentType("text/html");
			out.println("<h3 style='color: red'> Exception Occured: "+ex.getMessage()+" </h3>");
			RequestDispatcher rd = request.getRequestDispatcher("/index.html");
			rd.include(request, response);
		}
		
	}

}
