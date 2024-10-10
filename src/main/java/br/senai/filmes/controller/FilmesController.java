package br.senai.filmes.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.senai.filmes.model.Filmes;
import br.senai.filmes.repository.FilmesRepository;

@Controller
public class FilmesController {
	
	@Autowired
	private FilmesRepository fr;
	
	/*@GetMapping(value = "/CadastroFilmes")
	public String cadastroFilmes() {
		return "evento/cadastroFilmes";
	}*/
	
	@GetMapping(value = "/CadastroFilmes")
	public ModelAndView listarFilmes() {
		ModelAndView modelAndView = new ModelAndView();
	    List<Filmes> filmes = new ArrayList<>();
	    fr.findAll().forEach(filmes::add);
	    modelAndView.setViewName("evento/cadastroFilmes");
	    modelAndView.addObject("Filmes", filmes);
		return modelAndView;
	}
	
	@PostMapping(value = "/CadastrarFilmes")
	public String cadastroFilmes(Filmes filme) {
		fr.save(filme);
		return "redirect:/CadastroFilmes";
	}
	
	@PostMapping(value = "/DeletarFilmes")
	public String deletarFilme(Integer id) {
		fr.deleteById(id);
		return "redirect:/CadastroFilmes";
	}
	
	/*@PostMapping(value = "/ListarFilmes")
	public String listarFilmes2() {
	    List<Filmes> filmes = new ArrayList<>();
	    fr.findAll().forEach(filmes::add);
		return "redirect:/CadastroFilmes";
	}*/
}
