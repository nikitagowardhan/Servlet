package ServletCookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet3")
public class MyServlet3 extends HttpServlet
{

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter p = resp.getWriter();
		
		
		Cookie c[]=req.getCookies();
		
		if(c!=null){
			
			String uname = c[0].getValue();
			String upass = c[1].getValue();

			
			p.print("Welcome to your Servlet3"+ uname+" "+upass);
			p.print("<br><a href='MyServlet4'>Click for LogoutPage</a>");

		}
		
		else
		{
			resp.sendRedirect("Index.html");
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
