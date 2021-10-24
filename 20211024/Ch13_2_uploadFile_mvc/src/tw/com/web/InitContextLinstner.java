package tw.com.web;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import tw.com.web.tools.ImageTools;
@WebListener
public class InitContextLinstner  implements ServletContextListener {
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		String imagePagth = sce.getServletContext().getInitParameter("file_path");
		ImageTools.setImagePath(imagePagth);
	}

}
