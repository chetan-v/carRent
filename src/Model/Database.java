package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

	private String user = "postgres";
	private String password = "password";
	private String url = "jdbc:postgresql://localhost:5432/carrentalsystem"; // Updated URL for PostgreSQL
	private Statement statement;

	public Database() {
		try {
			Connection connection = DriverManager.getConnection(url, user, password);
			statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Statement getStatement() {
		return statement;
	}
}
