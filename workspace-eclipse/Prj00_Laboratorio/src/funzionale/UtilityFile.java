package funzionale;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

class Glossario{
	
	String voce;
	String desc;
	String link;

	public Glossario(String voce, String desc, String link) {
		
		this.voce = voce;
		this.desc = desc;
		this.link = link;
	}
	
	
	
}

public class UtilityFile {

	public static void main(String[] args) throws SQLException {

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/fintech", "root", "");
		
		
		
		
		try {
			List<String> readAllLines = Files.readAllLines(Paths.get("files/fintech_glossario.txt"), Charset.forName("utf-8"));
		
			readAllLines.forEach(riga -> {
				try {
				
				String[] split = riga.split("\\|");
				String voce = split[0];
				String desc = split[1];
				String link = split[2];
			
				Glossario g = new Glossario(voce, desc, link);
				
					PreparedStatement ps;
				
					ps = conn.prepareStatement("insert into voci_finaziarie (voce, descrizione, collegamento) value (?,?,?) ");
					ps.setString(1, voce);
					ps.setString(2, desc);
					ps.setString(3, link);
					
					ps.execute();
				
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			});
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
