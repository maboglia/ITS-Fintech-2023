package com.boglia.model;

import org.springframework.stereotype.Component;

@Component
public class Titolo {

	private String nome;
	private double valore;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValore() {
		return valore;
	}
	public void setValore(double valore) {
		this.valore = valore;
	}
	
	
	
}
