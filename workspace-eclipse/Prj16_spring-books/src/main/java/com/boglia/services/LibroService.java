package com.boglia.services;

import java.util.List;

import com.boglia.entities.Libro;

public interface LibroService {

	List<Libro> getLibri();
	Libro getLibroById(int id);
	
	Libro addLibro(Libro l);
	Libro updateLibro(Libro l);
	boolean deleteLibro(int id);
	
}
