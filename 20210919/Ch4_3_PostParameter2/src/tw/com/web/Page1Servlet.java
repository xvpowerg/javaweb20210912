package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/page1")
public class Page1Servlet extends HttpServlet {
	
private Map<String,String> foodMap = new HashMap<>();
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			resp.setContentType("text/html;charset=utf-8");
			
			foodMap.put("0", "雞腿");
			foodMap.put("1", "排骨");
			foodMap.put("2", "魚排");
			
			PrintWriter out =   resp.getWriter();
		//	out.println("page1 post");	
			String food = req.getParameter("food");
			//out.println("page1 food:"+food);	
			
//			String[] foods = req.getParameterValues("food");
//			for (String f : foods) {
//				out.println(f);
//				out.println("<br>");
//			}
			
			//可輸出所有的Parameter
//		Map<String,String[]> pMap = req.getParameterMap();		
//		pMap.forEach((k,v)->{
//					 for(String f : v) {
//							out.print(k+":"+f+"<br>"); 
//					 }		
//			});
			//values轉成文字
			String[] foods = req.getParameterValues("food");
			//method reference
			//foods轉成文字
			List<String> foodList = Stream.of(foods).map(foodMap::get).collect(Collectors.toList());
			//food對應的中文輸出成li格式
			String foodOlList = 
					foodList.stream().map(f->"<li>"+f+"</li>").collect(Collectors.joining());
			out.print("<ol>");
			out.print(foodOlList);
			out.print("</ol>");
			
		}
}
