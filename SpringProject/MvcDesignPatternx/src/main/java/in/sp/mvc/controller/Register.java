package in.sp.mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import in.sp.db.connection.DbConnection;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/registerform")
public class Register extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String name = request.getParameter("username");
		String email = request.getParameter("useremail");
		String password = request.getParameter("userpassword");
		String gender = request.getParameter("usergender");
		String city = request.getParameter("usercity");

		try {
			Connection con = DbConnection.getConnection();

			String insert_sql_query = "INSERT INTO register VALUES(?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(insert_sql_query);
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, password);
			ps.setString(4, gender);
			ps.setString(5, city);

			int count = ps.executeUpdate();
			if(count > 0) {
				out.print("<h3 style='color: green'>Registeration Successfully</h3>");

				RequestDispatcher rd = request.getRequestDispatcher("/login.html");
				rd.include(request, response);
			} 
			else {
				out.print("<h3 style='color: red'>Registeration failled..</h3>");

				RequestDispatcher rd = request.getRequestDispatcher("/register.html");
				rd.include(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
