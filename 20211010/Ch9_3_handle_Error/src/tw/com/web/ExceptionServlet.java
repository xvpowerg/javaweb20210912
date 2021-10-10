package tw.com.web;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/exception")
public class ExceptionServlet extends HttpServlet{
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
			int statusCode = (Integer)req.getAttribute("javax.servlet.error.status_code");
			String image = "image1.png";
			String msg = "找錯頁面了";
			switch(statusCode) {
				case 404:
					image = "image1.png";
					msg = "找錯頁面了";
					break;
				case 405:
					image = "image2.png";
					msg = "方法不對優!";
					break;	
			}
			req.setAttribute("image", image);
			req.setAttribute("msg", msg);
			
			req.getRequestDispatcher("error.jsp").forward(req, resp);
//			Enumeration<String>  enumeration = req.getAttributeNames();
//			while(enumeration.hasMoreElements()) {
//				String name = enumeration.nextElement();
//				System.out.println(name+":"+req.getAttribute(name));
//			}
			
		}
}
