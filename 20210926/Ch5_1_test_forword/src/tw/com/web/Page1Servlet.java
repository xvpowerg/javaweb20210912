package tw.com.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/page1")
public class Page1Servlet  extends HttpServlet{
	
	private String account = "qwer";
	private String password = "12345";
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			String acc = req.getParameter("account");
			String pass = req.getParameter("pass");
				//forward 在doXXX 目標的Servlet必須在相同方法(doXXX)
			if (pass.equals(password) && acc.equals(account)) {
				req.getRequestDispatcher("/page2").forward(req, resp);
			}else {
				req.getRequestDispatcher("/page3").forward(req, resp);
			}
			//req.getRequestDispatcher("/page2").forward(req, resp);
		}
}
