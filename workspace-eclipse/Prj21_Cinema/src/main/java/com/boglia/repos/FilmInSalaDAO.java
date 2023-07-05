package com.boglia.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boglia.entities.Film;
import com.boglia.entities.FilmInSala;

public interface FilmInSalaDAO extends JpaRepository<FilmInSala, Integer> {

	List<FilmInSala> findByFilm(Film film);
	
}
