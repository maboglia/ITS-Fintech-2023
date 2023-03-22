package db;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Set;
import java.util.TreeSet;

import model.Canzone;

public class ProvaTabCanzoni {

	public static void main(String[] args) {

		CanzoneDAO cd = new CanzoneDAOImpl();
		
		Set<String> cantanti = new TreeSet<>();
		
		
		try {
			
			PrintWriter pw = new PrintWriter(new File("files/cantanti.txt"));
			
			for (Canzone c : cd.getCanzoni()) {
				
				cantanti.add(c.getCantante());
				
				//System.out.println(c.getCantante() + " - " + c.getTitolo());
			}
			
			System.out.println("Ci sono " + cantanti.size() + " cantanti");
			
			cantanti.forEach(cantante -> pw.println(cantante));
			
			pw.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
