package tw.com.listenr;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import tw.com.bean.DbTools;
@WebListener
public class MyContextListener implements ServletContextListener{
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
			System.out.println("contextInitialized!!");
			ServletContext sc = sce.getServletContext();
			String dbName= sc.getInitParameter("dbname");
			String dbPassword = sc.getInitParameter("dbpassword");
			DbTools.initDbTools(dbName, dbPassword);
			
			
	}
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		System.out.println("contextDestroyed!!");
	}

}
