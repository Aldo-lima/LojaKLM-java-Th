package com.LojasKlm;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/teste")
	public String teste() {
		return "eventos/teste";
	}
	@RequestMapping("/")
	public String home() {
		return "lojaklm/home";
	}
	
		
	
}
