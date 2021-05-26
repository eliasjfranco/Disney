package com.disney.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.disney.model.Personaje;

@Repository
public interface IPersonaje extends JpaRepository<Personaje, String> {

	List<Personaje> findByNombre(String nombre);
	
	List<Personaje> findByEdad(Integer edad);
	
	List<Personaje> findByPeli(String nombre_peli);
}
