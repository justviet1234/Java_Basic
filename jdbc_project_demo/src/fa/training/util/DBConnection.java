package fa.training.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	protected Connection connection;

	public DBConnection() throws SQLException {
			String user = "saa";
			String pass = "123456";
			String url = "jdbc:sqlserver://LocalHost:1433;databaseName=GuitarShopDB";

//			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connection = DriverManager.getConnection(url, user, pass);
			System.out.println(connection);
		
	}

	public static void main(String[] args) throws SQLException {
		DBConnection context = new DBConnection();

	}

}
