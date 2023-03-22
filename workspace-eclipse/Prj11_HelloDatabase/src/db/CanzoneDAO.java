package db;

import java.sql.SQLException;
import java.util.List;

import model.Canzone;

public interface CanzoneDAO {

	//CRUD    
	//Create
	String ADD_CANZONE = "INSERT INTO canzoni (cantante, titolo) VALUES (?,?)";
	//Read
	String TROVA_TUTTI = "SELECT * FROM canzoni";
	String TROVA_UNA_CANZONE = "SELECT * FROM canzoni WHERE id = ?";
	//Update
	String UPDATE_CANZONE = "UPDATE canzoni SET titolo = ?, cantante = ? WHERE id = ?";
	//Delete
	String DELETE_CANZONE = "DELETE FROM canzoni WHERE id = ?";
	
	void addCanzone(Canzone c) throws SQLException;
	Canzone getCanzoneById(int id) throws SQLException;
	List<Canzone> getCanzoni() throws SQLException;
	void updateCanzone(Canzone c) throws SQLException;
	void deleteCanzone(int id) throws SQLException;
	
	
	
}
