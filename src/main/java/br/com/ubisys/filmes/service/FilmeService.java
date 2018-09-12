package br.com.ubisys.filmes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ubisys.filmes.model.Filme;
import br.com.ubisys.filmes.repository.FilmeRepository;

@Service
public class FilmeService {
	
	@Autowired
	private FilmeRepository repository;
	
	public List<Filme> findAll() {
		return repository.findAll();
	}
	
	public Filme findOne(Long id) {
		return repository.getOne(id);
	}
	
	public Filme save(Filme filme) {
		return repository.saveAndFlush(filme);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}

}
