package com.boglia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boglia.entities.Cinema;
import com.boglia.repos.CinemaDAO;

@Service 
public class CinemaServiceImpl implements CinemaService {

	@Autowired
	CinemaDAO dao;

	@Override
	public List<Cinema> getAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Cinema getById(int id) {
		// TODO Auto-generated method stub
		return dao.getReferenceById(id);
	}

	@Override
	public Cinema add(Cinema c) {
		// TODO Auto-generated method stub
		return dao.save(c);
	}
	
	
	
}
