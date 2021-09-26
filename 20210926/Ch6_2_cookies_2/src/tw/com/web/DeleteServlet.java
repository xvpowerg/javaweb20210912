package tw.com.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Optional;
import java.util.stream.Stream;
@WebServlet("/delete")
public class DeleteServlet  extends HttpServlet{
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			String account = req.getParameter("account");
		    Cookie[] cookies = 	req.getCookies();
			  String cookieName = account+"_count";
		    if (cookies != null) {
		    	Stream<Cookie> cookStr =   Stream.of(cookies);
		    	Optional<Cookie> optCookie = 
		    			cookStr.filter(ck->ck.getName().equals(cookieName)).findFirst();
		    	if (optCookie.isPresent()) {		    		
		    		Cookie delCookie = new Cookie(cookieName,"");
		    		//delete
		    		delCookie.setMaxAge(0);	
		    		//設定為-1表示瀏覽器關閉時移除
		    		//delCookie.setMaxAge(-1);
		    		resp.addCookie(delCookie);
		    		
		    	}
		    }
		}
}
