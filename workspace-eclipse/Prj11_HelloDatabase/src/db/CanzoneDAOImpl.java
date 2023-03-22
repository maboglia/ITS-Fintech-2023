package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Canzone;

public class CanzoneDAOImpl implements CanzoneDAO{

	private Connessione miaConn = new Connessione();
	private Connection conn = miaConn.getConn();
	
	private Statement statement;//un contenitore per istruzioni SQL
	private PreparedStatement ps;//contenitore per istruzioni SQL PIù EVOLUTO
	
	private ResultSet rs;//Contenitore di risultati di una QUERY
	
	
	
	
	@Override
	public void addCanzone(Canzone c) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Canzone getCanzoneById(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Canzone> getCanzoni() throws SQLException {
		List<Canzone> canzoni = new ArrayList<>();
		
		statement = conn.createStatement();
		
		this.rs = statement.executeQuery(TROVA_TUTTI);
		
		while(rs.next()) {
			//estraggo i dati dal result set
			int id = rs.getInt("id");
			String titolo = rs.getString("titolo");
			String cantante = rs.getString("cantante");
			
			//creo un oggetto temporaneo di tipo canzone
			Canzone c = new Canzone();
			c.setId(id);//setto le proprietà coi dati estratti dal database
			c.setTitolo(titolo);
			c.setCantante(cantante);

			canzoni.add(c);//aggiungo la canzone temporanea all'array di canzoni
		}
		
		return canzoni;//ritorno un ArrayList di canzoni con le canzoni del db
	}

	@Override
	public void updateCanzone(Canzone c) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCanzone(int id) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
