package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/Cookies")
public class LoginServlets extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		request.getRequestDispatcher("link.html").include(request, response);  
		
		String email = request.getParameter("UserEmail");
		String pass = request.getParameter("UserPassword");
		
		
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlets", "root", "iesbpl@2024");
			ps = con.prepareStatement("SELEC *FROM registerform WHERE email=? AND password=?");
			
			ps.setString(1, email);
			ps.setString(2, pass);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				
				
				out.print("<h3 style='color: green>You are Successfully logged in..</h3>");
				out.print("<br>Welcome, "+email);  
	              
	            Cookie ck=new Cookie("name",email);  
	            response.addCookie(ck);  
	            
	            RequestDispatcher rd = request.getRequestDispatcher("/Login.html");
	            rd.forward(request, response);
			}
			else {
				out.print("<h3 style='color: red>Soory! Email or Password is wrong..</h3>");
//				RequestDispatcher rd = request.getRequestDispatcher("/Login.html");
//				rd.include(request, response);
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
			out.print("<h3 style='color: red'>Exception Occured: "+ex.getMessage()+" </h3>");
//			RequestDispatcher rd = request.getRequestDispatcher("/Login.html");
//			rd.include(request, response);
		}
		finally {
			try {
				if(con != null) {
					con.close();
				}
				if(ps != null) {
					ps.close();
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
