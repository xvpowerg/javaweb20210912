package tw.com.bean;

import javax.servlet.http.HttpSessionBindingListener;

public class MyUser {
	 private String name;
	 private int point;
	public MyUser(String name, int point) {
		super();
		this.name = name;
		this.point = point;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	@Override
	public String toString() {
		return "MyUser [name=" + name + ", point=" + point + "]";
	}
	 
}
