package tw.com.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.joda.time.LocalTime;
@WebServlet("/page1")
public class Page1Servlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Cookie cookie1 = new Cookie("createTime",
				LocalTime.now().toString());
		Cookie cookie2 = new Cookie("createNname","Ken");
		Cookie cookie3 = new Cookie("testMaxage",LocalTime.now().toString());
		//2 * 24 * 60 * 60  兩天
		cookie3.setMaxAge(3 * 60 );//三分鐘 單位是秒
		resp.addCookie(cookie1);
		resp.addCookie(cookie2);
		resp.addCookie(cookie3);
		resp.getWriter().println("Add Cookies!!");
		
		
		
	}
}
