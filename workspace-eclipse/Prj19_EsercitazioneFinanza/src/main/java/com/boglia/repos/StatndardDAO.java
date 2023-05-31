package com.boglia.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boglia.entities.StandarPoors;

public interface StatndardDAO extends JpaRepository<StandarPoors, Integer>{

	List<StandarPoors> findByGICSSector(String sector);
	
}
