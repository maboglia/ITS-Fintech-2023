package app;

public class Todo {

	String descrizione;
	
	public Todo(String desc) {
		descrizione = desc;
	}
	
	String stampa() {
		return descrizione;
	}
	
}
