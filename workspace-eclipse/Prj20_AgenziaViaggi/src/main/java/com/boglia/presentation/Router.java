package com.boglia.presentation;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpSession;

@Controller
public class Router {

	@GetMapping("/index")
	public String home() {
		return "home";
	}
	

	@RequestMapping(method = RequestMethod.GET, path = "home")
	public String home3() {
		return "redirect:index";
	}	

	@GetMapping("/operatore/{nome}")
	public String home4(@PathVariable("nome") String nome, HttpSession session) {
		System.out.println(nome);
		session.setAttribute("titolare", nome);
		return nome;
	}	
	
	@GetMapping("/rispondi")
	@ResponseBody
	public String home2() {
		
		List<String> stringhe = Arrays.asList("fine", "intervallo", "pausetta", "caffè");
		
		return stringhe.toString();
	}
	
}
