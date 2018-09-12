package br.com.ubisys.filmes.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.ubisys.filmes.model.Filme;
import br.com.ubisys.filmes.service.FilmeService;

@Controller
public class FilmeController {
	
	@Autowired
	private FilmeService service;
	
	@GetMapping("/")
	public ModelAndView findAll() {
		
		ModelAndView mv = new ModelAndView("/filmes");
		mv.addObject("filmes", service.findAll());
		
		return mv;
	}
	
	@GetMapping("/add")
	public ModelAndView add(Filme filme) {
		
		ModelAndView mv = new ModelAndView("/filmePersist");
		mv.addObject("filme", filme);
		
		return mv;
	}
	
	@GetMapping("/edit/{id}")
	public ModelAndView edit(@PathVariable("id") Long id) {
		
		return add(service.findOne(id));
	}
	
	@GetMapping("/delete/{id}")
	public ModelAndView delete(@PathVariable("id") Long id) {
		
		service.delete(id);
		
		return findAll();
	}

	@PostMapping("/save")
	public ModelAndView save(@Valid Filme filme, BindingResult result) {
		
		if(result.hasErrors()) {
			return add(filme);
		}
		
		service.save(filme);
		
		return findAll();
	}

}
