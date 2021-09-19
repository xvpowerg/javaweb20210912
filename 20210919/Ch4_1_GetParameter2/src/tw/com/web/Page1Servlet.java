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
			HttpServletResponse resp)
					throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
	
		 String numberStr =  req.getParameter("number");
		 String lineStr = req.getParameter("line");
		//Integer.parseInt 要小心處理
		 int count = 0,line = 0;
		 try {
			 count = Integer.parseInt(numberStr);
			  line = Integer.parseInt(lineStr); 
		 }catch(Exception ex) {
			 System.out.println("ex:"+ex);
		 }
		  
		 
		 
		 out.println("<html>");
		 out.println("<body>");
		 out.println("<p>");
		 for (int i = 1;i<= count;i++) {
			 out.println(i+" ");
			 if (i % line  == 0) out.println("<br>");
		 }
		 out.println("</p>");
		 out.println("</body>");
		 out.println("</html>");
		
			
	}
}
