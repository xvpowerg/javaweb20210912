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
			  String msg = account+"熱烈歡迎您第一次登入";
			  String cookieName = account+"_count"; 
			  int count = 0;
			  if (cookies != null) {
				  Stream<Cookie> cookieStream = Stream.of(cookies);
				  ////找到某個cookie 的name 
				  Optional<Cookie> cookOp = cookieStream.filter(cook->cook.getName().
						  equals(cookieName)).findFirst();
				 //找到相對應的cookie 
				 if(cookOp.isPresent()) {
					//依cookie 的name 做不同資訊做處裡
					 String countStr = cookOp.get().getValue();
					 count = Integer.parseInt(countStr);
					 msg = account+"歡迎您第"+(count+1)+"次登入"; 
				 }
				 
			   }			   
			  out.println("<h1>");
			  out.println(msg);
			  out.println("</h1>");
			  
			   //如果是count 會做+1 寫回cookie
			  count++;
			  Cookie countCookie = new Cookie(cookieName,count+"");
			  //countCookie.setMaxAge(expiry);
			  resp.addCookie(countCookie);
			
	
			
			
					
		}
}
