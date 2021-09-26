package tw.com.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.bean.UserInfo;
import tw.com.web.tools.ServiceRequestAttr;
@WebServlet("/page1")
public class Page1Servlet  extends HttpServlet{
	//三大區塊可以存Attribute
	//Request 範圍 Page to Page 每個客戶端資料不會衝突
	//Session 範圍 User (瀏覽器沒關閉資料就存在) 每個客戶端資料不會衝突
	//Application 範圍整個容器  因為共用可能會衝突
	
	//Attribute 都是Object
	//Parameter 都是String
	
		@Override
		protected void doPost(HttpServletRequest req,
				HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			String userName = req.getParameter("user_name");
			String userId = req.getParameter("user_id");
			
			UserInfo userInfo = new UserInfo(userName,userId);
			
			String service = req.getParameter("service");
			
			int serviceType = Integer.parseInt(service);
			
			System.out.println(userName+":"+userId+":"+service);
			String toPage = "";
			switch(serviceType) {
			case 0:
				toPage = "/page2";
				break;
			case 1:
				toPage = "/page3";
				break;	
			case 2:
				toPage = "/page4";
				break;
			}
			
			//req.setAttribute("name", userName);
//			req.setAttribute("id", userId);
//			req.setAttribute("userInfo", userInfo);
			
			ServiceRequestAttr.setName(req, userName);
			ServiceRequestAttr.setId(req, userId);
			ServiceRequestAttr.setUserInfo(req, userInfo);
			req.getRequestDispatcher(toPage).forward(req, resp);
			
			
		}
}
