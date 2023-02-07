
public class Dado {

	int facce = 6;
	String colore = "bianco";
	
	int lancia() {
		
		double casuale = Math.random();
		
		int valoreCasuale = (int)(casuale * facce)+1;
		
		return valoreCasuale;
	}
	
	
}
