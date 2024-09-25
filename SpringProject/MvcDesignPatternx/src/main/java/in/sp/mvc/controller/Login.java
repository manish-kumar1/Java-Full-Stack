package in.sp.mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import in.sp.db.connection.DbConnection;
import in.sp.model.UserInfo;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/loginform")
public class Login extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String myemail = request.getParameter("email1");
		String mypassword = request.getParameter("password1");
		
		try {
			Connection con = DbConnection.getConnection();
			
			String select_sql_query = "SELECT *FROM register WHERE email=? AND password=?";
			PreparedStatement ps = con.prepareStatement(select_sql_query);
			
			ps.setString(1, myemail);
			ps.setString(2, mypassword);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				
				UserInfo user = new UserInfo();
				
				user.setName(rs.getString("name"));
				user.setEmail(rs.getString("email"));
				user.setGender(rs.getString("gender"));
				user.setCity(rs.getString("city"));
				
				HttpSession session = request.getSession();
				session.setAttribute("session_user", user);
				
				RequestDispatcher rd = request.getRequestDispatcher("/profile.jsp");
				rd.forward(request, response);
			}
			else {
				out.print("<h3 style='color: red'>Email or Password didn't matched</h3>");
				RequestDispatcher rd = request.getRequestDispatcher("/login.html");
				rd.include(request, response);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
