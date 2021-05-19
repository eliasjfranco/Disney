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
	
	public Pelicula_Serie getPersonaje(String titulo) {
		return repository.getOne(titulo);
	}
	
	public void updatePersonaje(Pelicula_Serie peli) {
		repository.save(peli);
	}
	
	public void deletePersonaje(String titulo) {
		repository.deleteById(titulo);
	}
	
}
