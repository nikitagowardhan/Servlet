package ServletCookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet4")
public class MyServlet4 extends HttpServlet
{

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter p = resp.getWriter();
		
		Cookie c1=new Cookie("uname","");
		Cookie c2 = new Cookie("upass", "");
		
		c1.setMaxAge(0);
		c2.setMaxAge(0);

		resp.addCookie(c1);
		resp.addCookie(c2);
		
		p.print("Welcome to LogOut Page");

		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
