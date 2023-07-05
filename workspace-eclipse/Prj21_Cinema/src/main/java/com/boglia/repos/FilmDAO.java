package com.boglia.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boglia.entities.Film;

public interface FilmDAO extends JpaRepository<Film, Integer> {

}
