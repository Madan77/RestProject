package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
	Connection connection = null;

	public Connection getConnection() {
		try {
			String connectionURL = "jdbc:mysql://localhost:3306/Login";

			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(connectionURL, "root", "madan007");

		} catch (Exception e) {
			System.out.println("driver not found" + e);
		}
		return connection;
	}

}