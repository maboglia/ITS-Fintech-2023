package com.boglia.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.boglia.model.Titolo;

@Component
public class Portafoglio {

	private List<Titolo> titoli = new ArrayList<>();
	
	public List<Titolo> getTitoli() {
		return titoli;
	}
	
	public void addTitolo(Titolo t) {
		titoli.add(t);
	}

	public void addTitolo(String nome, double prezzo) {
		Titolo t = new Titolo();
		t.setNome(nome);
		t.setValore(prezzo);
		titoli.add(t);
	}

	
}
