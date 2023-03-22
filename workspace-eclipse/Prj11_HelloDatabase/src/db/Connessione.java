package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {
	
	private final String URL = "jdbc:mysql://localhost:3306/fintech";
	private final String USER = "root";
	private final String PASS = "";

	private Connection conn;
	
	public Connection getConn() {
		
		if (conn == null)
			connetti();
		
		return this.conn;
	}
	
	private void connetti() {
		try {
			this.conn = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("Siamo connessi");
		} catch (SQLException e) {

			System.err.println("Non sei connesso, si è verificato un problema: ");
			System.err.println(e.getMessage());
		
		}
	}
	
}
