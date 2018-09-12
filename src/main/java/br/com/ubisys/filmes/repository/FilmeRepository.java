package br.com.ubisys.filmes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ubisys.filmes.model.Filme;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Long> {

}
