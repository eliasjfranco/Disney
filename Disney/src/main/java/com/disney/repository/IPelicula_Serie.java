package com.disney.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.disney.model.Pelicula_Serie;

@Repository
public interface IPelicula_Serie extends JpaRepository<Pelicula_Serie, Long> {
	
	List<Pelicula_Serie> findByTitulo(String titulo);
	
	List<Pelicula_Serie> findByPeli_Genero(long id);
	
	List<Pelicula_Serie> findAllByOrderByTituloAsc();
	
	List<Pelicula_Serie> findAllByOrderByTituloDesc();

}