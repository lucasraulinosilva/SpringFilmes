package br.senai.filmes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.senai.filmes.model.Filmes;

@Repository
public interface FilmesRepository extends CrudRepository<Filmes, Integer>{

}
