package tw.com.web.listener;

import java.util.Optional;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

import tw.com.bean.MyUser;

public class MyUserBinding implements HttpSessionBindingListener {
	private MyUser user;
	public MyUserBinding(MyUser user) {
		this.user = user;
	}
	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		//�s�W�� �٥�������JSession�� �N�|�I�s�����
		MyUserBinding userBind =  
				(MyUserBinding)event.getSession().getAttribute("myuser");
		Optional<MyUserBinding> op = Optional.ofNullable(userBind);
		
		userBind =  op.orElse(new MyUserBinding(new MyUser("empty",0)));
		
		System.out.println("valueBound Session:"+(userBind.user));
		System.out.println("valueBound event:"+event.getValue());//���ȼg�J��Ʈw
		System.out.println("=========================");
	}
	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		MyUserBinding userBind =  
				(MyUserBinding)event.getSession().getAttribute("myuser");
		Optional<MyUserBinding> op = Optional.ofNullable(userBind);
		userBind =  op.orElse(new MyUserBinding(new MyUser("empty",0)));
		System.out.println("valueUnbound Session:"+userBind.user);
		System.out.println("valueUnbound event:"+event.getValue());//�n�X�g�J��Ʈw
		System.out.println("=========================");
	}
	
	public void setUserName(String name) {
		this.user.setName(name);
	}
	
	
}
