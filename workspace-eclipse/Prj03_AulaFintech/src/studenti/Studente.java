package studenti;

public class Studente {

	int id;
	String nome;
	String cognome;
	
	public Studente(int id, String nome, String cognome) {
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		System.out.println("Costruito lo studente " + nome);
	}
	
	
	
}
