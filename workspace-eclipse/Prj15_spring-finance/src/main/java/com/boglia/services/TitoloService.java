package com.boglia.services;

import java.util.List;

import com.boglia.entities.Titolo;

public interface TitoloService {

	List<Titolo> getTitoli();
	List<Titolo> getTitoliByRaccomandazioni(String raccomandazioni);

	Titolo getTitoloById(int id);
	
	Titolo addTitolo(Titolo t);
	
}
