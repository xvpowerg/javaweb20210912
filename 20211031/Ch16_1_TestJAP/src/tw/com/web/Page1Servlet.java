package tw.com.web;

import java.io.IOException;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.jpa.MyUser;
@WebServlet("/page1")
public class Page1Servlet extends HttpServlet{
		@Inject
		EntityManager em;
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
				MyUser myuser = new MyUser();
				myuser.setAccount("ken");
				myuser.setPassword("123456");
				em.persist(myuser);
			
		}
}
