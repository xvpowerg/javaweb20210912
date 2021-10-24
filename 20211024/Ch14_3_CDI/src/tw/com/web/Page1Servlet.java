package tw.com.web;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.bean.Apple;
@WebServlet("/page1")
public class Page1Servlet  extends HttpServlet {
		@Inject
		@Named("redApple")
		Apple apple;
		@Inject
		@Named("QueryApples")
		List<Apple> appleList;
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			//Contexts and Dependency Injection
			resp.getWriter().println(apple);
			resp.getWriter().println(appleList);
		}
}
