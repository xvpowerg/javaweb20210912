package tw.com.web;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;

@WebServlet("/page")
public class Page1Servlet extends HttpServlet{
	//建立Servlet 步驟
		//1 一定要有一個類別 並且繼承HttpServlet
		//2 可以使用以下兩種方式定義 動作名稱 可任選一種 或 都使用
		// a @WebServlet()
	//404 找不到網址
	//405 沒有指定的方法
	//HttpServletRequest 接收(input) 資料的接收
	//HttpServletResponse 回傳(output) 瀏覽器畫面上的輸出
	protected void doGet(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException,IOException{
		
		PrintWriter out = resp.getWriter();
//		out.println("<html>");
//		out.println("<body>");
		out.println("Ken");
		out.println("Vivin");
//		out.println("</body>");
//		out.println("</html>");
	}
	
}
