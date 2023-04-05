package com.boglia.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "fintech_piazzaaffari")
public class Titolo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String titolo;
	private String raccomandazioni;
	private int capitale;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getRaccomandazioni() {
		return raccomandazioni;
	}
	public void setRaccomandazioni(String raccomandazioni) {
		this.raccomandazioni = raccomandazioni;
	}
	public int getCapitale() {
		return capitale;
	}
	public void setCapitale(int capitale) {
		this.capitale = capitale;
	}
	
	
	
	
}
