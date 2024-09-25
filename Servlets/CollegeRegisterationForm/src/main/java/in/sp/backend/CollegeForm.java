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

@WebServlet("/registerform")
public class CollegeForm extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		Connection con = null;
        PreparedStatement ps = null;
		
		String sname = request.getParameter("sname");
		if(sname.trim().length() <= 3) {
			out.println("<h3 style='color: red> Student name is not valid please try again..");
			RequestDispatcher rd = request.getRequestDispatcher("/index.html");
			rd.include(request, response);
		}
		String semail = request.getParameter("email");
		String spass = request.getParameter("password");
		String sgender = request.getParameter("gender");
		String sdob = request.getParameter("dob");
		String smobile = request.getParameter("mobile");
		String scourse = request.getParameter("course");
		String scountry = request.getParameter("country");
		String sdegree = request.getParameter("degree");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlets", "root", "iesbpl@2024");
			ps = con.prepareStatement("INSERT INTO registerform VALUES(?,?,?,?,?,?,?,?,?)");
			
			ps.setString(1, sname);
			ps.setString(2, semail);
			ps.setString(3, spass);
			ps.setString(4, sgender);
			ps.setString(5, sdob);
			ps.setString(6, smobile);
			ps.setString(7, scourse);
			ps.setString(8, scountry);
			ps.setString(9, sdegree);
			
			int count = ps.executeUpdate();
			if(count > 0) {
				
				out.print("<h3 style='color: green'> Student registred successfully </h3>");
				RequestDispatcher rd = request.getRequestDispatcher("/login.html");
				rd.forward(request, response);
			}
			else {
				
				out.print("<h3 style='color: red'> Student not registred due to some error </h3>");
				RequestDispatcher rd = request.getRequestDispatcher("/index.html");
				rd.include(request, response);
			}
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
			
			out.print("<h3 style='color: red'> Exception Occured: "+ex.getMessage()+"</h3>");
			RequestDispatcher rd = request.getRequestDispatcher("/index.html");
			rd.include(request, response);
		}
		finally {
            // Ensure resources are closed
            try {
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
                out.print("<h3 style='color: red;'>Exception Occurred while closing resources: " + e.getMessage() + "</h3>");
                RequestDispatcher rd = request.getRequestDispatcher("/index.html");
                rd.include(request, response);
            }
		}
		
	}

}
