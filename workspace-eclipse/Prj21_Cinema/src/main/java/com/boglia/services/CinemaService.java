package com.boglia.services;

import java.util.List;

import com.boglia.entities.Cinema;

public interface CinemaService {

	List<Cinema> getAll();
	Cinema getById(int id);
	Cinema add(Cinema c);
}
