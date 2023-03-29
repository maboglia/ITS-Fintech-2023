package test;

import java.sql.SQLException;
import java.util.List;

import model.Game;
import repo.GameDAO;

public class TestGameDAO {

	public static void main(String[] args) {

		GameDAO dao = new GameDAO();
		
		try {
			List<Game> allGames = dao.getAllGames();
			
			for (Game game : allGames) {
				System.out.println(game);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
