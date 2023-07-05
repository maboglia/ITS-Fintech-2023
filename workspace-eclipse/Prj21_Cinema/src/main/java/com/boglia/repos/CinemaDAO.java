package com.boglia.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boglia.entities.Cinema;

public interface CinemaDAO extends JpaRepository<Cinema, Integer> {

}
