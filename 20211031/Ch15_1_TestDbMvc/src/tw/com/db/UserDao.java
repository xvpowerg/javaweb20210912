package tw.com.db;

import tw.com.bean.User;

public interface UserDao {
	public boolean login(String account,String password);
	public boolean regisrter(String account,String password);
	public User  findUserByAccount(String account);
	public boolean isDuplicateAccount(String account);
}
