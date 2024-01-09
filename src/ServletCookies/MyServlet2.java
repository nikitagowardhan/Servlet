package ServletCookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet2")
public class MyServlet2 extends HttpServlet
{

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter p = resp.getWriter();
		String uname = req.getParameter("uname");
		String upass = req.getParameter("upass");
		
		Cookie c1=new Cookie("uname",uname);
		Cookie c2 = new Cookie("upass", upass);
		
		resp.addCookie(c1);
		resp.addCookie(c2);

		
		
		p.print("<h1>Welcome to your profile "+uname+"</h1>");
		p.print("<br><a href='MyServlet3'>click here</a>");
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
