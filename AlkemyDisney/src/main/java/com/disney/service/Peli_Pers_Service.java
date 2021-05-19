package com.disney.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.disney.model.Pelicula_Personaje;
import com.disney.repository.IPelicula_Personaje;

@Service("Peli_Pers_Service")
public class Peli_Pers_Service {

	@Autowired
	IPelicula_Personaje repository;
	
	public void save(Pelicula_Personaje peli) {
		repository.save(peli);
	}
	
	public List<Pelicula_Personaje> getAll(){
		return repository.findAll();
	}
	
	public Pelicula_Personaje getPeli_Personaje(String titulo) {
		return repository.getOne(titulo);
	}
	
	public void updatePeli_Personaje(Pelicula_Personaje peli) {
		repository.save(peli);
	}
	
	public void deletePeli_Personaje(String titulo) {
		repository.deleteById(titulo);
	}
	
}
