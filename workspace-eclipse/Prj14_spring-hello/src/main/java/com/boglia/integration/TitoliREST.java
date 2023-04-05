package com.boglia.integration;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boglia.controller.Portafoglio;
import com.boglia.model.Titolo;

@RestController
@RequestMapping("api")
public class TitoliREST {

	private Portafoglio service = new Portafoglio();
	
	@GetMapping("titoli")
	public List<Titolo> getTitoli(){
		
		service.addTitolo("FIAT", 50);
		service.addTitolo("SanPaolo", 150);
		service.addTitolo("Ferrari", 250);
		service.addTitolo("Maserati", 350);
		service.addTitolo("Lamborghini", 50);
		
		return service.getTitoli();
		
	}
	
	@PostMapping("titoli")
	public Titolo addTitolo(@RequestBody Titolo t) {
		service.addTitolo(t);
		return t;
	}
	
}
