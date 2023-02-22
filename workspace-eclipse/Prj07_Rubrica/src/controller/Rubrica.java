package controller;

import java.util.Arrays;

import model.Contatto;

public class Rubrica {

	private String nome;
	private Contatto[] contatti;
	
	public Rubrica(String nome, int numeroContatti) {
		this.nome = nome;
		this.contatti = new Contatto[numeroContatti];
	}

	public void addContatto(Contatto c, int pos) {
		this.contatti[pos] = c;
	}
	
	public void addContatto(String nome, String numero, int pos) {
		Contatto c = new Contatto(nome, numero);
		this.contatti[pos] = c;
	}
	
	public Contatto getContattoByPosizione(int pos) {
		return this.contatti[pos];
	}

	public String getNome() {
		return nome;
	}

	public Contatto[] getContatti() {
		return contatti;
	}

	@Override
	public String toString() {
		return "Rubrica [nome=" + nome + ", contatti=" + Arrays.toString(contatti) + "]";
	}
	
	
	
}
