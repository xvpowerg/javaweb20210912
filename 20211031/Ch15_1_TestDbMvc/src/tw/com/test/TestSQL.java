package tw.com.test;

import tw.com.bean.User;
import tw.com.db.DbTools;
import tw.com.db.MySqlUser;

public class TestSQL {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/test20211031?serverTimezone=CST&useSSL=false&allowPublicKeyRetrieval=true";
		String user = "root";
		String password = "123456";
		// TODO Auto-generated method stub
		DbTools.setUrl(url);
		DbTools.setPassword(password);
		DbTools.setAccount(user);
		MySqlUser sql = new MySqlUser();
		User userObj =  sql.findUserByAccount("Ken");
		System.out.println(userObj);
	}

}
