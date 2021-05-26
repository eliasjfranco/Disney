package com.disney.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.disney.model.Pelicula_Serie;
import com.disney.repository.IPelicula_Serie;

@Service("PeliculaService")
public class Pelicula_Service {

	@Autowired
	IPelicula_Serie repository;
	
	public void save(Pelicula_Serie peli) {
		repository.save(peli);
	}
	
	public List<Pelicula_Serie> getAll(){
		return repository.findAll();
	}
	
	public Pelicula_Serie getPelicula(String titulo) {
		return repository.findByTitulo(titulo);
	}
	
	public void updatePelicula(Pelicula_Serie peli) {
		repository.save(peli);
	}
	
	public void deletePelicula(Long id) {
		repository.deleteById(id);
	}
	
	public List<Pelicula_Serie> getByGenero(long id) {
		return repository.findByPeli_Genero(id);
	}
	
}
