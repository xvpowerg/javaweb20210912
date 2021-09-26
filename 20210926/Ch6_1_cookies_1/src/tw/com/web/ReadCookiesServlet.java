package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/readCookies")
public class ReadCookiesServlet  extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		Cookie[] cookieArray =  req.getCookies();
		out.print("<html>");
		out.print("<body>");
		out.print("<ol>");
		if (cookieArray != null) {
			for (Cookie cook : cookieArray) {
				out.print("<li>");
				out.print(cook.getName()+":"+cook.getValue());
				out.print("</li>");				
			}			
		}
		out.print("</ol>");
		out.print("</body>");
		out.print("</html>");
		
	}
	
}
