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
	
	public Genero getGeneroById(long id) {
		return repository.getOne(id);
	}
	
	public Genero getGeneroByNombre(String nombre) {
		return repository.findByNombre(nombre);
	}
	
	public void updateGenero(Genero genero) {
		repository.save(genero);
	}
	
	public void deleteGenero(long id) {
		repository.deleteById(id);
	}
}