package com.disney.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.disney.model.Pelicula_Serie;

@Repository
public interface IPelicula_Serie extends JpaRepository<Pelicula_Serie, String> {

}
