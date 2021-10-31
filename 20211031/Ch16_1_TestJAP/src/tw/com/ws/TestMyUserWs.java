package tw.com.ws;

import javax.ejb.EJB;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.databind.ObjectMapper;

import tw.com.ejb.MyUserBenanLocal;
import tw.com.jpa.MyUser;

@Path("myuser")
@Produces(MediaType.APPLICATION_JSON)//回傳json格式
public class TestMyUserWs {
	@EJB
	private MyUserBenanLocal myuserBane;		
	@POST
	public String regisrter(@FormParam("account") String account,@FormParam("password")String password) {
		MyUser myuser = new MyUser();	
		myuser.setAccount(account);
		myuser.setPassword(password);
		boolean pass =  myuserBane.regisrter(myuser);
		//Jackson 
		ObjectMapper objMap = new ObjectMapper();//物件轉JSON
		if (pass) {
			try {
				String  json = objMap.writeValueAsString(myuser);
				return json;
			}catch(Exception ex) {
				
			}
			
				
		}
		return "{\"status\":false}";
	}
	
	
	//get 將@FormParam換成 @QueryParam
	@POST
	@Path("login")
	public String  login(@FormParam("account") String account,
			@FormParam("password")String password) {
		MyUser myuser = new MyUser();	
		myuser.setAccount(account);
		myuser.setPassword(password);
	    boolean status = myuserBane.login(myuser);
		if (status) {
			return "{\"status\":true}";	
		}
		  return "{\"status\":false}";
	}
	
	
}
