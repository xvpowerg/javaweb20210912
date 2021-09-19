package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/page1")
public class Page1Servlet  extends HttpServlet {
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			resp.setContentType("text/html;charset=UTF-8");
			req.setCharacterEncoding("utf-8");
			
			PrintWriter out = resp.getWriter();
			
			out.println("Page1Post");			
			String msg = req.getParameter("msg");
			out.println(msg);
			//中文顯示問題
			out.println("哈嘍！！");
		}
}
