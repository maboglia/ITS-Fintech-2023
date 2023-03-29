package controller;

import java.io.IOException;
import java.sql.SQLException;

import org.json.JSONArray;

import com.mysql.cj.xdevapi.JsonArray;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import repo.GameDAO;


@WebServlet("/giochi")
public class GamesREST extends HttpServlet {

	GameDAO dao = new GameDAO();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("application/json");;
		
		try {
			JSONArray array = new JSONArray(dao.getAllGames());
			response.getWriter().append(array.toString());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
}
