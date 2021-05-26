package com.disney.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.disney.model.Pelicula_Serie;

@Repository
public interface IPelicula_Serie extends JpaRepository<Pelicula_Serie, Long> {
	
	Pelicula_Serie findByTitulo(String titulo);
	
	List<Pelicula_Serie> findByPeli_Genero(long id);

}
