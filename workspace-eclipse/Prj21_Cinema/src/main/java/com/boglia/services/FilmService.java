package com.boglia.services;

import java.util.List;

import com.boglia.entities.Film;

public interface FilmService {

	List<Film> getAll();
	Film getById(int id);
	Film add(Film c);
}
