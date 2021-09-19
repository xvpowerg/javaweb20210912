package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/page1")
public class Page1Servlet extends HttpServlet{
		@Override
		protected void doGet(HttpServletRequest req, 
				HttpServletResponse resp) throws ServletException, IOException {
				// TODO Auto-generated method stub
				PrintWriter out = resp.getWriter();
				//out.println("Page1 DoGet!!");
				String name = req.getParameter("name");
				//name如果是null顯示 Error!!				
				out.println("<html>");
				out.println("<body>");
				out.println("<H1>");
				
				name = name == null?"":name;
				switch(name.toLowerCase()) {
				case "ken":
					out.println("Manager");	
					break;
				case "vivin":
					out.println("PM");
					break;
				case "lucy":
					out.println("RD");
					break;
				default:
					out.println("Error");
					break;
				}
				out.println("</H1>");
				out.println("</body>");
				out.println("</html>");
				
				
		}
}
