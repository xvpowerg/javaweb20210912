package tw.com.cdi;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.inject.Produces;
import javax.inject.Named;

import tw.com.bean.Apple;

public class MyProduces {
	@Produces
	@Named("redApple")
	private Apple getRedApple() {
		Apple redApple = new Apple();
		redApple.setName("Red Apple");
		redApple.setPrice(100);
		return redApple;
	}
	@Produces
	@Named("QueryApples")
	private List<Apple> queryAllApple(){
		List<Apple> list = new ArrayList();
		Apple ap1 = new Apple();
		ap1.setName("A1");
		ap1.setPrice(100);
		Apple ap2 = new Apple();
		ap2.setName("A2");
		ap2.setPrice(200);
		Apple ap3 = new Apple();
		ap3.setName("A3");
		ap3.setPrice(300);
		list.add(ap1);
		list.add(ap2);
		list.add(ap3);
		return list;
	}
}
