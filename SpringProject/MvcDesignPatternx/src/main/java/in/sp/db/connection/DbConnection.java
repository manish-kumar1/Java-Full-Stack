package in.sp.db.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	
	public static Connection getConnection() {
		
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring_jdbc_db", "root", "iesbpl@2024");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return con;
	}
}
