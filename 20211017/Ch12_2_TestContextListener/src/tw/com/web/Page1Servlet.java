package tw.com.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.bean.DbTools;
@WebServlet("/page1")
public class Page1Servlet extends HttpServlet {
			@Override
			protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				// TODO Auto-generated method stub
				resp.getWriter().print("Page1");
				DbTools dbTools = DbTools.getDbTools();
				System.out.println(dbTools.getDbName());
				System.out.println(dbTools.getDbPpassword());
				
			}
}
