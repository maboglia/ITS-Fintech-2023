package model;

public class Veicolo {

	//stato interno
	private static int counter = 1;
	private int id;
	protected String marca;
	protected String modello;
	protected double prezzo;

	//metodi
	
	//costruttori
	public Veicolo() {
		this.id = counter++;
		//System.out.println("Veicolo generico costruito");
	}
	
	/**
	 * Costruttore del veicolo
	 * @param marca Inserire la marca del veicolo
	 */
	public Veicolo(String marca) {
		this();
		this.marca = marca;
		//System.out.println("Veicolo marchiato costruito");
	}

	
	//getters and setters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca.toUpperCase();
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		return "Veicolo [id=" + id + ", marca=" + marca + ", modello=" + modello + ", prezzo=" + prezzo + "]";
	}
	
	
}
