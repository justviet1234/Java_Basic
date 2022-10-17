package fa.training.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtils {
	private static DBUtils instance;
	private Connection connection;

	private DBUtils() {
		Properties properties = new Properties();
		try {
			//properties.load(DBUtils.class.getResourceAsStream("/dbCOnfig.properties"));
			String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
			String url = "jdbc:sqlserver://localhost:1433;databaseName=BillManagement";
			String userName = "sa";
			String password = "123456";
			Class.forName(driver);
			connection = DriverManager.getConnection(url, userName, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Get the connection from the instance
	 *
	 * @return {@link Connection}
	 */
	public Connection getConnection() {
		return connection;
	}

	/**
	 * Create new instance which connects with the database.
	 *
	 * @return DBUtils
	 * @throws SQLException if connection false.
	 */
	public static DBUtils getInstance() throws SQLException {
		if (instance == null || instance.getConnection().isClosed()) {
			instance = new DBUtils();
		}
		return instance;
	}
}
