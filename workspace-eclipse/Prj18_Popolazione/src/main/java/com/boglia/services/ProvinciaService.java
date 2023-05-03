package com.boglia.services;

import java.util.List;

import com.boglia.entities.Provincia;

public interface ProvinciaService {

	List<String> getRegioni();
	List<Provincia> getProvince();
	List<Provincia> getProvinceByRegione(String regione);
	Provincia getProvinciaById(int id);
	
	
}
