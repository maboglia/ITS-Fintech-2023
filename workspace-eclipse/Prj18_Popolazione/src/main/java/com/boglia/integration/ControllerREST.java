package com.boglia.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boglia.entities.Provincia;
import com.boglia.services.ProvinciaService;

@RestController
@RequestMapping("api")
public class ControllerREST {

	@Autowired
	private ProvinciaService service;
	
	@GetMapping("province")
	List<Provincia> getProvince(){
		return service.getProvince();
	}
	
	@GetMapping("province/{id}")
	Provincia getProvincia(@PathVariable int id) {
		System.out.println(id);
		return service.getProvinciaById(id);
	}
	
	@GetMapping("regioni")
	List<String> getRegioni(){
		return service.getRegioni();
	}
	
	
}
