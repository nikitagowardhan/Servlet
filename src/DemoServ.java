import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class DemoServ extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text.html");
		PrintWriter p = resp.getWriter();
		
		String uname = req.getParameter("uname");
		String upass = req.getParameter("passwd");
		
		if(upass.equals("admin"))
		{
			RequestDispatcher d = req.getRequestDispatcher("Profile");
			d.forward(req, resp);
			req.getRequestDispatcher("Profile").forward(req, resp);
		}
		else
		{
			RequestDispatcher d = req.getRequestDispatcher("Login.html");
			d.include(req, resp);
			p.print("<p style ='color:red'>Wrong Password</p>");
			
		}
}

	
}
