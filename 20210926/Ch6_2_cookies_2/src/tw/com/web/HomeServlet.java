package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Optional;
import java.util.stream.Stream;
@WebServlet("/home")
public class HomeServlet  extends HttpServlet{
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
				throws ServletException, IOException {
			resp.setContentType("text/html;charset=utf-8");
			PrintWriter out = resp.getWriter();
			  Cookie[] cookies =  req.getCookies();
			  String account = req.getParameter("account");
			  String msg = account+"���P�w��z�Ĥ@���n�J";
			  String cookieName = account+"_count"; 
			  int count = 0;
			  if (cookies != null) {
				  Stream<Cookie> cookieStream = Stream.of(cookies);
				  ////���Y��cookie ��name 
				  Optional<Cookie> cookOp = cookieStream.filter(cook->cook.getName().
						  equals(cookieName)).findFirst();
				 //���۹�����cookie 
				 if(cookOp.isPresent()) {
					//��cookie ��name �����P��T���B��
					 String countStr = cookOp.get().getValue();
					 count = Integer.parseInt(countStr);
					 msg = account+"�w��z��"+(count+1)+"���n�J"; 
				 }
				 
			   }			   
			  out.println("<h1>");
			  out.println(msg);
			  out.println("</h1>");
			  
			   //�p�G�Ocount �|��+1 �g�^cookie
			  count++;
			  Cookie countCookie = new Cookie(cookieName,count+"");
			  //countCookie.setMaxAge(expiry);
			  resp.addCookie(countCookie);
			
	
			
			
					
		}
}
