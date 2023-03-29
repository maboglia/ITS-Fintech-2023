package repo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Game;

public class GameDAO {

	Connessione miaConn;
	Connection conn;
	Statement stat;//contenitore per istruzioni da dare al db
	ResultSet rs;//contenitore per risultati che ritornano dal db

	public GameDAO() {
		this.miaConn = new Connessione();
		this.conn = miaConn.getConn();
	}
	
	public List<Game> getAllGames() throws SQLException{
		List<Game> giochi = new ArrayList<>();
		
		String query = "select * from games";
		this.stat = this.conn.createStatement();
		
		this.rs =   this.stat.executeQuery(query);
		
		while(   this.rs.next()  ) {//gira finché ci sono record
			Game giocoTemp = new Game();
			
			giocoTemp.setId(this.rs.getInt("id"));
			giocoTemp.setGame(this.rs.getString("game"));
			giocoTemp.setGenre(this.rs.getString("genre"));
			giocoTemp.setPublisher(this.rs.getString("publisher"));
			giocoTemp.setOriginalPlatform(this.rs.getString("original_platform"));
			giocoTemp.setYear(this.rs.getInt("year"));

			giochi.add(giocoTemp);//aggiungo alla list di giochi

		}
		
		return giochi;
	}
	
	
}
