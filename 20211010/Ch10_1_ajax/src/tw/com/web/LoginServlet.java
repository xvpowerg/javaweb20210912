package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			resp.setContentType("text/html;charset=UTF-8");
			 PrintWriter out =  resp.getWriter();
			String account = "qwer";	
			String password = "12345";
			
			String inAccount = req.getParameter("account");
			String inPassword =  req.getParameter("password");
			
			if (inAccount.equals(account) && inPassword.equals(password) ) {
				out.println("жие\");		
			}else {
				out.println("ев▒╤");
			}
		}
}
