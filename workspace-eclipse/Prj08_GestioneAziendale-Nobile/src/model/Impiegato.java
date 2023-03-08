package model;

public class Impiegato {

	//ATTRIBUTI
	
	private String id,nome,cognome;
	private int anno_nascita,stipendio;
	
	//PROPRIETA'
	
	public String getId() {		return id;	}

	public void setId(String id) {		this.id = id;	}

	public String getNome() {		return nome;	}

	public void setNome(String nome) {		this.nome = nome;	}

	public String getCognome() {		return cognome;	}

	public void setCognome(String cognome) {		this.cognome = cognome;	}

	public int getAnno_Nascita() {		return anno_nascita;	}

	public void setAnno_Nascita(int anno_nascita) {		this.anno_nascita = anno_nascita;	}

	public int getStipendio() {		return stipendio;	}

	public void setStipendio(int stipendio) {		this.stipendio = stipendio;	}
	
	//COSTRUTTORE	

	public Impiegato(String nome, String cognome, int anno_nascita) 
	{
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.anno_nascita = anno_nascita;
		this.stipendio=0;
		this.id=Segreteria.CreaID(nome, cognome, anno_nascita);
	}//end Impiegato()

	@Override
	public String toString() {
		return String.format("Impiegato nome: %s, cognome: %s, anno di nascita: %d, id: %s",nome,cognome,anno_nascita,id);
	}//end toString()	
}//end class
