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
		//新增時 還未正式放入Session時 就會呼叫此函數
		MyUserBinding userBind =  
				(MyUserBinding)event.getSession().getAttribute("myuser");
		Optional<MyUserBinding> op = Optional.ofNullable(userBind);
		
		userBind =  op.orElse(new MyUserBinding(new MyUser("empty",0)));
		
		System.out.println("valueBound Session:"+(userBind.user));
		System.out.println("valueBound event:"+event.getValue());//取值寫入資料庫
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
		System.out.println("valueUnbound event:"+event.getValue());//登出寫入資料庫
		System.out.println("=========================");
	}
	
	public void setUserName(String name) {
		this.user.setName(name);
	}
	
	
}
