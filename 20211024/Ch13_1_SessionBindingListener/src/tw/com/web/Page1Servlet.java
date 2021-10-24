package tw.com.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tw.com.bean.MyUser;
import tw.com.web.listener.MyUserBinding;

@WebServlet("/page1")
public class Page1Servlet extends HttpServlet{
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			String act = req.getParameter("act");
			HttpSession session = req.getSession();
		   switch(act) {
			case  "login":
				System.out.println("login!");
				MyUser user = new MyUser("Ken",50);//希望資料庫一併紀錄登入時間
				MyUserBinding myUserBind = new MyUserBinding(user);
				session.setAttribute("myuser", myUserBind);
				break;
			case  "replace":
				MyUser user2 = new MyUser("Lindy",82);//希望資料庫一併紀錄登入時間
				MyUserBinding myUserBind2 = new MyUserBinding(user2);
				session.setAttribute("myuser", myUserBind2);
				System.out.println("replace!");
				break;		
			case  "logout":
				System.out.println("logout!");
			    session.removeAttribute("myuser");//希望資料庫一併紀錄登出時間
				break;	
				
			}
		}
}
