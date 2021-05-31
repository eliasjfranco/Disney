package com.disney.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.disney.model.Pelicula_Genero;
import com.disney.model.Pelicula_Serie;
import com.disney.repository.IPelicula_Genero;
import com.disney.repository.IPelicula_Serie;

@Service("PeliculaService")
public class Pelicula_Service {

	@Autowired
	IPelicula_Serie repository;
	
	@Autowired
	IPelicula_Genero genero_repo;
	
	public void save(Pelicula_Serie peli) {
		repository.save(peli);
	}
	
	public List<Pelicula_Serie> getAll(){
		return repository.findAll();
	}
	
	public void updatePelicula(Pelicula_Serie peli) {
		repository.save(peli);
	}
	
	public void deletePelicula(Long id) {
		repository.deleteById(id);
	}
	
	public List<Pelicula_Serie> getByGenero(long id) {
		//Lista para realizar la busqueda
		List<Pelicula_Serie> pelicula = new ArrayList<Pelicula_Serie>();
		pelicula = getAll();
		System.out.println("cantidad de peliculas en lista: " + pelicula.size());
		
		//Lista para saber que peliculas son del parametro del genero
		List<Pelicula_Genero> genero = genero_repo.findAll();
		
		System.out.println("cantidad de genero en lista: " +genero.size());
		
		//Lista que va a retonar las peliculas que tendran el valor del parametro id
		List<Pelicula_Serie> retorno = new ArrayList<Pelicula_Serie>();
		
		long id_pelicula;
		
		//recorremos la lista genero, para obtener el id_pelicula que corresponde con el parametro del genero buscado
		for(int i = 0; i <genero.size(); i++ ) {
			if(genero.get(i).getId_genero() == id) {
				id_pelicula = genero.get(i).getId_pelicula();
				
				//recorremos la lista de todas las peliculas, para encontrar y guardar en una lista aparte la pelicula que corresponde con el genero buscado
				for(int x = 0 ; x < pelicula.size(); x++) {
					if(pelicula.get(x).getId() == id_pelicula) {
						retorno.add(pelicula.get(x));
						
						//realizamos el cierre del bucle
						x = pelicula.size() + 1;
					}
				}
			}
		}
		genero.clear();
		pelicula.clear();
		for(int i = 0; i<retorno.size(); i++) {
			System.out.println("id pelicula: " + retorno.get(i).getId());
		}
		return retorno;
	}
	
	public List<Pelicula_Serie> getByTitulo(String titulo) {
		return repository.findByTitulo(titulo);
	}
	
	public List<Pelicula_Serie> findAllAsc(){
		return repository.findByOrderByTituloAsc();
	}
	
	public List<Pelicula_Serie> findAllDesc(){
		return repository.findByOrderByTituloDesc();
	}
	
}