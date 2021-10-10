package tw.com.web;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/exception2")
public class Exception2Servlet extends HttpServlet{
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			action(req,resp);
		}
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
			action(req,resp);
		}
		protected void action(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {	
			resp.setContentType("text/html;charset=UTF-8");
			//resp.getWriter().println("Error2!!");
			//Exception 類別
			Class classType =  (Class)req.getAttribute("javax.servlet.error.exception_type");		
			System.out.println(classType.getName());
			//Exception物件
			Exception obj = (Exception)req.getAttribute("javax.servlet.error.exception");
			
			String image = "";
			String msg =  obj.toString();
			
			if (classType.equals(NullPointerException.class)) {
				image = "image3.png";
			}else if(classType.equals(ArrayIndexOutOfBoundsException.class)) {
				image = "image4.png";
			}
			
			req.setAttribute("image", image);
			req.setAttribute("msg", msg);
			req.getRequestDispatcher("error.jsp").forward(req, resp);
//			Enumeration<String>  enumeration = req.getAttributeNames();
//			while(enumeration.hasMoreElements()) {
//				String name = enumeration.nextElement();
//				System.out.println("exception2:"+name+":"+req.getAttribute(name));
//			}
//			
			
			
		}
}
