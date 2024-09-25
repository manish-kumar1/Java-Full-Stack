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
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/boosdk")
public class DemoRequestDispatcher extends HttpServlet{

	/**
	 * 
	 */
private static final long serialVersionUID = 1L;
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String myemail = request.getParameter("email");
		String mypassword = request.getParameter("pass");
		
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlets", "root", "iesbpl@2024");
			ps = con.prepareStatement("SELECT *FROM registerform WHERE email=? and password=?");
			
			ps.setString(1, myemail);
			ps.setString(2, mypassword);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				// Session
				
				HttpSession session = request.getSession();
				session.setAttribute("session_name", rs.getString("name"));
				session.setAttribute("session_email", rs.getString("email"));
				session.setAttribute("session_gender", rs.getString("gender"));
				session.setAttribute("session_course", rs.getString("course"));
				session.setAttribute("session_country", rs.getString("country"));
				
				out.print("Login Successfully");
				
				RequestDispatcher rd = request.getRequestDispatcher("/home.jsp");
				rd.forward(request, response);
			}
			else {
				
				out.print("<h3 style='color: red'> Email or Password didn't matched </h3>");
				RequestDispatcher rd = request.getRequestDispatcher("/index.html");
				rd.include(request, response);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
			out.print("<h3 style='color: red'> Exception Occured: "+e.getMessage()+" </h3>");
			RequestDispatcher rd = request.getRequestDispatcher("/index.html");
			rd.include(request, response);
		}
		finally {
			try {
				if(ps != null) {
					ps.close();
				}
				if(con != null) {
					con.close();
				}
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
			
		}
		
	}

}
