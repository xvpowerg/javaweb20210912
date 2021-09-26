package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.web.tools.ServiceRequestAttr;
@WebServlet("/page2")
public class Page2Servlet  extends HttpServlet{
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			resp.setContentType("text/heml;charset=utf-8");
			PrintWriter out = resp.getWriter();
			//String name = req.getAttribute("name").toString();
			String name = ServiceRequestAttr.getName(req);
			out.print(name+":±b³æ¬d¸ß");
			
		}
}
