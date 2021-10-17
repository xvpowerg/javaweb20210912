package tw.com.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tw.com.bean.Item;
import tw.com.bean.User;
@WebServlet("/page1")
public class Page1Servlet  extends HttpServlet{
			@Override
			protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				// TODO Auto-generated method stub
					
				Item item1 = new Item("Item1",100);
				User user1 = new User("User1",25);
				req.setAttribute("item", item1);
				HttpSession session = req.getSession();
				session.setAttribute("user", user1);				
				
				User user2 = new User("User2",21);
				User user3 = new User("User3",18);
				User user4 = new User("User4",16);
				User user5 = new User("User5",30);
				
				List<User> arrayList = new ArrayList<>();
				arrayList.add(user2);
				arrayList.add(user3);
				arrayList.add(user4);
				arrayList.add(user5);
				
				Map<String,User> userMap = new HashMap<>();
				userMap.put(user2.getName(), user2);
				userMap.put(user3.getName(), user3);
				userMap.put(user4.getName()+" "+"AA", user4);
				
				session.setAttribute("userList", arrayList);
				session.setAttribute("userMap", userMap);
				//session.setAttribute("test_empty", userMap);
				req.getRequestDispatcher("page1.jsp").forward(req, resp);
				
				
				
								
			}
}
