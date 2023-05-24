package com.boglia.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.boglia.entities.Provincia;


public interface ProvinciaDAO extends JpaRepository<Provincia, Integer> {

	//derived query
	
	List<Provincia> findByRegione(String regione);
	
	
//	
//	@Query(value = "select comune from popolazione_italiana_regione where regione = :regione", nativeQuery = true)
//	List<String> trovaProvince(@Param(":regione") String regione);
//	
}
