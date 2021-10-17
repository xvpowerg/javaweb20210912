package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/page1")
public class Page1Servlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		boolean isPass = false;
		String toLocation = "user.html";
		String msg ="失敗";
		//設定輸出為JSON
		resp.setContentType("application/json");
		resp.setCharacterEncoding("UTF-8");
		
		PrintWriter out = resp.getWriter();
		String account = req.getParameter("account");
		String password = req.getParameter("password");
		
		if (account.equals("qwer") && password.equals("12345")) {
			isPass = true;
			msg = "成功";
		}
		//out.println("account:"+account+"password:"+password);
		//String json = "{\"account\":\"%s\",\"password\":\"%s\"}";
		String json = "{\"msg\":\"%s\",\"toLocation\":\"%s\",\"isPass\":%b}";
		json = String.format(json, msg,toLocation,isPass);
		System.out.println("json:"+json);
		out.print(json);
		
	}
}
