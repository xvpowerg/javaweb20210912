package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

@WebServlet("/page1")
public class Page1Servlet extends HttpServlet {
	private ExecutorService es;
		@Override
		public void init() throws ServletException {
		// TODO Auto-generated method stub
			es = Executors.newCachedThreadPool();
		}
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			PrintWriter out =   resp.getWriter();
			es.execute(()->{
				System.out.println("Start!!"+Thread.currentThread().getName());
				try {
					TimeUnit.SECONDS.sleep(10);	
				}catch(Exception ex) {
					
				}							
				out.println("Complete!!");
				System.out.println("End!!"+Thread.currentThread().getName());
				
			});

				
				
			
		}
}
