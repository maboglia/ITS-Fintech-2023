package model;

/*
 * IMPIEGATO
La classe Impiegato ha

attributi di tipo string: nome, cognome, id;
attributi di tipo int: anno di nascita e stipendio;
i relativi metodi getter e setter di tutti. Il setter dell'attributo id però non prende in input il valore ma lo ottiene con il metodo creaID della classe Segreteria.
 * */

public class Impiegato {
	/* Stato interno */
	private String nome;	
	private String cognome;
	private String id;
	private int annoNascita;
	private int stipendio;
	
	/* Stato interno */
	
	// Metodo costruttore
	public Impiegato(String nome, String cognome, int annoNascita) {
		this.nome = nome;
		this.cognome = cognome;
		this.annoNascita = annoNascita;
		
		this.stipendio = 0;
		this.id = Segreteria.creaID(nome, cognome, annoNascita);
	}
	// Metodo costruttore 
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAnnoNascita() {
		return annoNascita;
	}
	public void setAnnoNascita(int annoNascita) {
		this.annoNascita = annoNascita;
	}
	public int getStipendio() {
		return stipendio;
	}
	public void setStipendio(int stipendio) {
		this.stipendio = stipendio;
	}

	@Override
	public String toString() {
		return "Nome impiegato: " + nome + ", Cognome impiegato: " + cognome + ", Id impiegato: " + id;
	}
	
}
