package br.senai.filmes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@GetMapping("SpringFilmes/")
	public String index() {
		return "index";
	}
}
