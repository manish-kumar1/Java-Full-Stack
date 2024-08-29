package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Loginx")
public class RequestDispatcherx extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String myemail = request.getParameter("email1");
        String mypassword = request.getParameter("pass");

        PrintWriter out = response.getWriter();

        if (myemail=="manish@gmail.com" && mypassword=="manish") {
        	
            RequestDispatcher rd = request.getRequestDispatcher("/profile.jsp");
            rd.forward(request, response);
            
        } 
        else {
            response.setContentType("text/html");
            out.print("<h3 style='color: red'>Email id and Password didn't match</h3>");
            RequestDispatcher rd = request.getRequestDispatcher("/index.html"); // Corrected path here
            rd.include(request, response);
        }
    }
}
