package tw.com.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;


@NamedQueries({
	@NamedQuery(name="findMyUser",
			query="SELECT myUserObj FROM MyUser myUserObj WHERE "+
				"myUserObj.account =:account")	
})
@Entity
public class MyUser {
	@Id //主鍵
	@GeneratedValue //自動流水號
	private int id;
	@Column(unique = true,nullable = false)
	private String account;
	@Column(nullable = false)
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "MyUser [id=" + id + ", account=" + account + ", password=" + password + "]";
	}
	
}
