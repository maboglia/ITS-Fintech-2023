package com.boglia.services;

import java.util.List;

import com.boglia.entities.Film;
import com.boglia.entities.FilmInSala;

public interface FilmInSalaService {

	List<FilmInSala> getAll();
	FilmInSala getById(int id);
	FilmInSala add(FilmInSala c);
	
	List<FilmInSala> findByFilm(Film f);
}
