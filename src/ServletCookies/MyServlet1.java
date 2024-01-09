package ServletCookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet1")
public class MyServlet1 extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text.html");
		PrintWriter p = resp.getWriter();
		
		String uname = req.getParameter("uname");
		String upass = req.getParameter("upass");
		
		
		
		
		if(upass.equals("admin"))
		{
			
			req.getRequestDispatcher("MyServlet2").forward(req, resp);
			
		}
		else
		{
			RequestDispatcher d = req.getRequestDispatcher("Index.html");
			d.include(req, resp);
			p.print("<br><p style ='color:red'>Wrong Password</p>");
			
		}
}


}
