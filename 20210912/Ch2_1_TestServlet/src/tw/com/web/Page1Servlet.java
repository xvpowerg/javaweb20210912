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
	//�إ�Servlet �B�J
		//1 �@�w�n���@�����O �åB�~��HttpServlet
		//2 �i�H�ϥΥH�U��ؤ覡�w�q �ʧ@�W�� �i����@�� �� ���ϥ�
		// a @WebServlet()
	//404 �䤣����}
	//405 �S�����w����k
	//HttpServletRequest ����(input) ��ƪ�����
	//HttpServletResponse �^��(output) �s�����e���W����X
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
