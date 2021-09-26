package tw.com.web.tools;

import javax.servlet.http.HttpServletRequest;

import tw.com.bean.UserInfo;

public class ServiceRequestAttr {
	public static final String NAME_KEY = "name";
	public static final String ID_KEY = "id";
	public static final String USER_INFO_KEY = "userinfo";
	public static void setName(HttpServletRequest req ,
			String name) {
		
		req.setAttribute(NAME_KEY, name);
	}
	public static String getName(HttpServletRequest req) {
		return req.getAttribute(NAME_KEY).toString();
	}
	
	public static void setId(HttpServletRequest req ,
			String id) {
		req.setAttribute(ID_KEY, id);
	}
	public static String getId(HttpServletRequest req) {
		return req.getAttribute(ID_KEY).toString();
	}
	
	public static void setUserInfo(HttpServletRequest req,
			UserInfo userInfo) {
		req.setAttribute(USER_INFO_KEY,userInfo);
		
	}
	public static UserInfo getUserInfo(HttpServletRequest req) {
		return (UserInfo)req.getAttribute(USER_INFO_KEY);
	}
}
