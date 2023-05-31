package com.boglia.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.boglia.entities.Glossario;
import com.boglia.services.GlossarioService;

import jakarta.servlet.http.HttpSession;

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
	@GetMapping("glossario")
	public String tabGlossario(Model m) {
		m.addAttribute("titolo", "Tabella glossario");
		m.addAttribute("col1", "Voce");
		m.addAttribute("col2", "Descrizione");
		m.addAttribute("voci", service.getAll());
		return "glossario";
	}
	
	@GetMapping("standard/{settore}")
	public String tabStandard(Model m, @PathVariable("settore") String settore) {
		m.addAttribute("titolo", "Tabella standard");
		m.addAttribute("col1", "Nome");
		m.addAttribute("col2", "Anno di fondazione");
		m.addAttribute("voci", service.getStandarPoorsBySector(settore));
		return "standard";
	}
	
	@GetMapping("standard")
	public String tabStandard(Model m) {
		m.addAttribute("titolo", "Tabella standard");
		m.addAttribute("col1", "Nome");
		m.addAttribute("col2", "Anno di fondazione");
		m.addAttribute("voci", service.getStandarPoors());
		return "standard";
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
