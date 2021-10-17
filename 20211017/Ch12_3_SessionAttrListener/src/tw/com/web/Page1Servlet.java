package tw.com.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/page1")
public class Page1Servlet extends HttpServlet {
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
				throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		session.setAttribute("userName", "Howard");//新增	
		session.setAttribute("userName", "Lucy");//修改
		session.removeAttribute("userName");//刪除
				
		}
}
