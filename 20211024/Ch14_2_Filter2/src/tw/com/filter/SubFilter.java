package tw.com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebFilter("/sub/*")
public class SubFilter implements Filter{
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest httpReq = (HttpServletRequest)request;
		HttpServletResponse httpResp =(HttpServletResponse)response; 
		HttpSession  session = httpReq.getSession();
		Object obj =session.getAttribute("page1");
		System.out.println("SubFilter:"+obj);
		if (obj != null) {
			chain.doFilter(request, response);
		}else {
			httpResp.sendRedirect("../index.html");
		}
	
	}

}
