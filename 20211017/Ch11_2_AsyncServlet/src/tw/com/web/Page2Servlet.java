package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
//可即時輸出回應
@WebServlet(urlPatterns = {"/page2"},asyncSupported = true)
public class Page2Servlet extends HttpServlet {
	private ExecutorService es;
		@Override
		public void init() throws ServletException {
		// TODO Auto-generated method stub
			es = Executors.newCachedThreadPool();
		}
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			//PrintWriter out =   resp.getWriter();
			AsyncContext ctx = req.startAsync();
			
			es.execute(()->{
				System.out.println("Start!!"+Thread.currentThread().getName());
				try {
					TimeUnit.SECONDS.sleep(10);	
					//取得輸出的Response
				  PrintWriter out = ctx.getResponse().getWriter();
				  
				  out.print("Complete!!");
				  ctx.complete();//告知非同步完成				  
				}catch(Exception ex) {
						
				}			
				System.out.println("End!!"+Thread.currentThread().getName());
				
			});

				
				
			
		}
}
