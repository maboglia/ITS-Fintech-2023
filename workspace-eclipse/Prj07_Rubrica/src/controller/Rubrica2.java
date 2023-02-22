package controller;

import java.util.ArrayList;
import java.util.Arrays;

import model.Contatto;

public class Rubrica2 {

	private String nome;
	private ArrayList<Contatto> contatti;
	
	public Rubrica2(String nome) {
		this.nome = nome;
		this.contatti = new ArrayList<>();
	}

	public void addContatto(Contatto c) {
		this.contatti.add(c);
	}
	
	public void addContatto(String nome, String numero) {
		Contatto c = new Contatto(nome, numero);
		this.contatti.add(c);
	}
	
	public Contatto getContattoByPosizione(int pos) {
		return this.contatti.get(pos);
	}

	public String getNome() {
		return nome;
	}

	public ArrayList<Contatto> getContatti() {
		return contatti;
	}

	@Override
	public String toString() {
		return "Rubrica [nome=" + nome + ", contatti=" + this.contatti.toString() + "]";
	}
	
	
	
}
