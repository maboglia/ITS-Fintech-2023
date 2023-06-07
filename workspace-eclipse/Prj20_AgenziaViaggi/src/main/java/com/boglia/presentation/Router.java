package com.boglia.presentation;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Router {

	@GetMapping("/index")
	public String home() {
		return "home";
	}
	
	@GetMapping("/rispondi")
	@ResponseBody
	public String home2() {
		
		List<String> stringhe = Arrays.asList("fine", "intervallo", "pausetta", "caffè");
		
		return stringhe.toString();
	}
	
}
