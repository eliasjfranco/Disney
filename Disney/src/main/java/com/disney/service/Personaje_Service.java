package com.disney.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.disney.model.Personaje;
import com.disney.repository.IPersonaje;

@Service("PersonajeService")
public class Personaje_Service {
	
	@Autowired
	IPersonaje repository;
	
	public void save(Personaje pers) {
		repository.save(pers);
	}
	
	public List<Personaje> getAll(){
		return repository.findAll();
	}
	
	public Personaje getPersonaje(String nombre) {
		return repository.getOne(nombre);
	}
	
	public void updatePersonaje(Personaje pers) {
		repository.save(pers);
	}
	
	public void deletePersonaje(String nombre) {
		repository.deleteById(nombre);
	}
	
	public List<Personaje> findByNombre(String nombre){
		return repository.findByNombre(nombre);
	}
	
	public List<Personaje> findByEdad(Integer edad){
		return repository.findByEdad(edad);
	}
	
	public List<Personaje> findByPelicula(String nomb_peli){
		return repository.findByPeli(nomb_peli);
	}

	public boolean existByName(String nombre) {
		return repository.existsById(nombre);
	}

}