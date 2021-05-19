package com.disney.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.disney.model.Genero;
import com.disney.repository.IGenero;

@Service("GeneroService")
public class Genero_Service {

	@Autowired
	IGenero repository;
	
	public void save(Genero genero) {
		repository.save(genero);
	}
	
	public List<Genero> getAll(){
		return repository.findAll();
	}
	
	public Genero getPersonaje(String nombre) {
		return repository.getOne(nombre);
	}
	
	public void updatePersonaje(Genero genero) {
		repository.save(genero);
	}
	
	public void deletePersonaje(String nombre) {
		repository.deleteById(nombre);
	}
}
