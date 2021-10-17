package tw.com.bean;

public class DbTools {
	private String dbName,dbPpassword;
	private static DbTools dbTools;
	private DbTools(String dbName,String dbpassword) {
		this.dbName = dbName;
		this.dbPpassword = dbpassword;
	}

	
	public  static void initDbTools(String dbName,String dbpassword) {
		
		dbTools = new DbTools(dbName,dbpassword);
	}

	public static DbTools getDbTools() {
		return dbTools;
	}


	public String getDbName() {
		return dbName;
	}


	public void setDbName(String dbName) {
		this.dbName = dbName;
	}


	public String getDbPpassword() {
		return dbPpassword;
	}


	public void setDbPpassword(String dbPpassword) {
		this.dbPpassword = dbPpassword;
	}
	
	
	
}
