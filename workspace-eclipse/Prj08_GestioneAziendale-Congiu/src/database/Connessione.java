package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {

	private final String URL="jdbc:mysql://localhost:3306/provajava";
	private final String USER="root";
	private final String PSW="";
	
	private Connection conn=null;
	
	public void connetti(){
		try {
			this.conn=DriverManager.getConnection(URL, USER, PSW);	
			System.out.println("connsessione riuscita");
		}catch (SQLException e){
			System.err.println("connessione non riuscita per: "+e.getMessage());
		}
	}
	
	public Connection getConn() {
		return conn;
	}
}
