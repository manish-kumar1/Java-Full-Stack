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

@WebServlet("/servlet1")
public class DemoApplication extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("userName");
		String pass = request.getParameter("userPass");
		
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlets", "root", "iesbpl@2024");
			ps = con.prepareStatement("select *from registerform where name=? and password=?");
			
			ps.setString(1, name);
			ps.setString(2, pass);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				out.print("Welcome");
				HttpSession session = request.getSession();
				session.setAttribute("session_name", rs.getString("name"));
				session.setAttribute("session_email", rs.getString("email"));
				
				RequestDispatcher rd = request.getRequestDispatcher("/home.jsp");
				rd.forward(request, response);
			}
			else{  
				out.print("Sorry UserName or Password Error!");  
			    RequestDispatcher rd=request.getRequestDispatcher("/login.html");  
			    rd.include(request, response);                  
			}  
		}
		catch(Exception e) {
			e.printStackTrace();
			out.print("Sorry UserName or Password Error!");  
			RequestDispatcher rd=request.getRequestDispatcher("/login.html");  
			rd.include(request, response);       
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
