package tw.com.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
@WebListener
public class MyHttpSessionAttListener implements HttpSessionAttributeListener {
	@Override
	public void attributeAdded(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		Object obj = event.getValue();
		String name =   event.getName();
		HttpSession session =   event.getSession();
		System.out.println("attributeAdded:"+obj+":"+name);		
		System.out.println("attributeAdded:Session:"+session.getAttribute(name));
	
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		
		Object obj = event.getValue();
		String name =   event.getName();
		HttpSession session =   event.getSession();
		System.out.println("attributeReplaced:"+obj+":"+name);	//getValue取得未修改前的數值	
		System.out.println("attributeReplaced:Session"+session.getAttribute(name));
	}
	
	@Override
	public void attributeRemoved(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		Object obj = event.getValue();
		String name =   event.getName();
		HttpSession session =   event.getSession();
		System.out.println("attributeRemoved:"+obj+":"+name);//getValue取得移除改前的數值			
		System.out.println("attributeRemoved:Session:"+session.getAttribute(name));
	
	}
}
