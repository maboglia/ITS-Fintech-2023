package com.boglia.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.boglia.entities.Glossario;
import com.boglia.services.GlossarioService;

@Controller
public class ControllerMVC {

	@Autowired
	private GlossarioService service;
	
	@GetMapping(  {"/", "/home", "/index", "/prima"} )
	public String home(Model m) {
		m.addAttribute("titolo", "Prima pagina");
		return "home";
	}
	
	/**
	 * Serve per mostrare la vista col modulo per aggiungere nuove voci
	 * @return
	 */
	@GetMapping("voci/add")
	public String addView(Model m) {
		m.addAttribute("titolo", "Aggiungi una nuova voce");
		return "form";
	}
	
	
	/**
	 * Azione per aggiungere nuove voci
	 * @param g
	 * @return
	 */
	@PostMapping("voci")
	public String addVoce(Glossario g) {
		
		service.addNuovaVoce(g);
		
		return "redirect:/home";
	}
	
}
