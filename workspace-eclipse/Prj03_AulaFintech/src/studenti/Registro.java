package studenti;

import java.util.ArrayList;

public class Registro {

	String nome;
	//Studente[] elenco;
	ArrayList<Studente> elenco;
	
	/**
	 * Costruttore del registro
	 * @param nome Passare come parametro il nome del registro
	 */
	public Registro(String nome) {//new Registro("Corso Fintech")
		this.nome = nome;
		this.elenco = new ArrayList<>();
	}
	
	public void addStudente(Studente s) {
		elenco.add(s);
	}
	
	public void addStudente(int id, String nome, String cognome) {
		Studente s = new Studente(id, nome, cognome);
		elenco.add(s);
	}
	
	public void faiAppello() {
		
		for (Studente s : elenco) {
			System.out.println(s.nome.toUpperCase() + " " + s.cognome);
		}
		
		
	}
	
	
}
