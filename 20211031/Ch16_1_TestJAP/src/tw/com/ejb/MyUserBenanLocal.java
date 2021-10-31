package tw.com.ejb;

import javax.ejb.Local;

import tw.com.jpa.MyUser;
@Local
public interface MyUserBenanLocal {
	public boolean login(MyUser myUser);
	public boolean regisrter(MyUser myUser);
	public MyUser  findUserByAccount(String account);
	public boolean isDuplicateAccount(String account);
	public boolean deleteUser(MyUser myUser);
}
