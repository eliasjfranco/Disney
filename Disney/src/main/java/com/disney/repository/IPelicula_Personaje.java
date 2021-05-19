package com.disney.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.disney.model.Pelicula_Personaje;

@Repository
public interface IPelicula_Personaje extends JpaRepository<Pelicula_Personaje, String>{

}
