package com.boglia.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boglia.entities.Glossario;
import com.boglia.services.GlossarioService;

@RestController
public class ControllerRest {

	@Autowired
	private GlossarioService service;
	
	@GetMapping("voci")
	public List<String> getVoci(){
		return service.getVoci();
	}
	
	@GetMapping("voce/{word}")
	public Glossario getVoce(@PathVariable("word") String voce ) {
		return service.getByVoce(voce);
	} 

	@PostMapping("voce/json")
	public Glossario addVoce(@RequestBody Glossario g) {
		return service.addNuovaVoce(g);
	}
	
	
}
