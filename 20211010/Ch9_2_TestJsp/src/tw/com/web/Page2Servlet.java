package tw.com.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/page2")
public class Page2Servlet extends HttpServlet {
		@Override
		protected void doGet(HttpServletRequest req, 
				HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			HttpSession carSession = req.getSession();
			if (carSession.getAttribute("carList") == null) {
				resp.sendRedirect("index.html");
			}else {				
				resp.sendRedirect("car.jsp");
			}	
		}		
}
