package com.disney.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.disney.model.Pelicula_Genero;
import com.disney.repository.IPelicula_Genero;

@Service("Peli_Gen_Service")
public class Peli_Gen_Service {

	@Autowired
	IPelicula_Genero repository;
	
	public void save(Pelicula_Genero genero) {
		repository.save(genero);
	}
	
	public List<Pelicula_Genero> getAll(){
		return repository.findAll();
	}
	
	public void updateGenero(Pelicula_Genero genero) {
		repository.save(genero);
	}
	
	public void deleteGenero(long id) {
		repository.deleteById(id);
	}
}
