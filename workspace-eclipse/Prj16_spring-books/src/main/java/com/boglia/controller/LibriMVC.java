package com.boglia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boglia.entities.Libro;
import com.boglia.services.LibroService;

@Controller
@RequestMapping("")
public class LibriMVC {

	@Autowired
	private LibroService service;
	
	@GetMapping("libri")
	public String getLibri(Model m) {
		
		m.addAttribute("elencoLibri", service.getLibri());
		
		return "libreria";
	}
	
	@PostMapping("libri")
	public String addLibro(Libro l) {
		service.addLibro(l);
		return "redirect:libri";
	}
	
	
}
