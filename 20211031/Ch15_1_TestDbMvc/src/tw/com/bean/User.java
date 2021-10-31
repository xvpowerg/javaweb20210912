package tw.com.bean;

public class User {
		private int id;
		private String account;
		private String pssword;
		
		
		
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
		public String getPssword() {
			return pssword;
		}
		public void setPssword(String pssword) {
			this.pssword = pssword;
		}
		@Override
		public String toString() {
			return "User [id=" + id + ", account=" + account + ", pssword=" + pssword + "]";
		}
		
		
}
