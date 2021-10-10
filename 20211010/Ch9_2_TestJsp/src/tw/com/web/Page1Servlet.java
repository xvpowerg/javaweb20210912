package tw.com.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/page1")
public class Page1Servlet extends HttpServlet {
		private String[] itemNames= {"iphone18","ps6","RTX5070"};
		ArrayList<String>carList = new ArrayList();
		@Override
		protected void doPost(HttpServletRequest req,
				HttpServletResponse resp) throws ServletException, IOException {
			ArrayList<String> selectedItemList = new ArrayList<>();
			// TODO Auto-generated method stub
			resp.setContentType("text/html;charset=utf-8");
				HttpSession carSession = req.getSession();
		
				String[] items = req.getParameterValues("item");
				for(String v : items) {
					int idex = Integer.parseInt(v);
					//resp.getWriter().println("<p>"+itemNames[idex]+"</p>");					
					carList.add(itemNames[idex]);
					selectedItemList.add(itemNames[idex]);
				}
				carSession.setAttribute("carList", carList);
				//resp.getWriter().println("<a href='index.html'>Home</a>");	
				req.setAttribute("selectedItemList", selectedItemList);
				req.getRequestDispatcher("shopee_page.jsp").forward(req, resp);
				
			}
		
}
