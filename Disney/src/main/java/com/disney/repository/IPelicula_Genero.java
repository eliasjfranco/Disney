package com.disney.repository;

import com.disney.model.Pelicula_Genero;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPelicula_Genero extends JpaRepository<Pelicula_Genero, Long>{

}