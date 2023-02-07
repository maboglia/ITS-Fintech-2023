package app;

public class Todo {

	String descrizione;
	boolean completo;
	
	public Todo(String desc) {
		descrizione = desc;
		completo = false;
	}
	
	String stampa() {
		
		String risposta = "";
		
		if (completo==false) {
			risposta += "[ ]";
		} else {
			risposta += "[*]";
		}
		
		risposta += " " + descrizione;
		
		return risposta;
	}
	
}
