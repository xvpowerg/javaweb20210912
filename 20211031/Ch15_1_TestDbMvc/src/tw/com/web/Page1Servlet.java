package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.db.DbTools;
import tw.com.db.UserDao;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
@WebServlet("/page1")
public class Page1Servlet  extends HttpServlet{
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
//			String url = "jdbc:mysql://localhost:3306/test20211031?serverTimezone=CST&useSSL=false&allowPublicKeyRetrieval=true";
//			String user = "root";
//			String password = "123456";
//			try(Connection conn =   DriverManager.getConnection(url, user, password)){
//				
//			}catch(SQLException ex) {
//				System.out.println(ex);
//			}
			
			PrintWriter out = resp.getWriter();
			String account = "vivin";
			String password = "123456";
			UserDao userDao =   DbTools.getUserDao();
			boolean regisrter = false;
			boolean login = userDao.login(account, password);
			out.println("account:"+account+ "password:"+password+" login 1:"+login);
			if (!login) {
				 regisrter = userDao.regisrter(account, password);
				out.println("account:"+account+ "password:"+password+" regisrter:"+regisrter);
			}
			
			if (regisrter) {
				login = userDao.login(account, password);
				out.println("account:"+account+ "password:"+password+" login 2:"+login);
			}

		}
}
