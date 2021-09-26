package tw.com.bean;

public class UserInfo {
	private String name;
	private String userId;
	public UserInfo(String name, String userId) {
		this.name = name;
		this.userId = userId;
	}
	public UserInfo() {	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}	
	
}
