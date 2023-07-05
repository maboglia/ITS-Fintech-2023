package com.boglia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boglia.entities.Film;
import com.boglia.repos.FilmDAO;

@Service 
public class FilmServiceImpl implements FilmService {

	@Autowired
	FilmDAO dao;

	@Override
	public List<Film> getAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Film getById(int id) {
		// TODO Auto-generated method stub
		return dao.getReferenceById(id);
	}

	@Override
	public Film add(Film c) {
		// TODO Auto-generated method stub
		return dao.save(c);
	}
	
	
	
}
