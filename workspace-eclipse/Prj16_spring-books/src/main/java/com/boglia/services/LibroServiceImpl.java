package com.boglia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boglia.entities.Libro;
import com.boglia.repos.LibroDAO;

@Service
public class LibroServiceImpl implements LibroService {

	@Autowired
	private LibroDAO dao;
	
	
	@Override
	public List<Libro> getLibri() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Libro getLibroById(int id) {
		// TODO Auto-generated method stub
		return dao.getReferenceById(id);
	}

	@Override
	public Libro addLibro(Libro l) {
		// TODO Auto-generated method stub
		return dao.save(l);
	}

	@Override
	public Libro updateLibro(Libro l) {
		// TODO Auto-generated method stub
		return dao.save(l);
	}

	@Override
	public boolean deleteLibro(int id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
		return true;
	}

}
