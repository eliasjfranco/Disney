package com.disney.model;

import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name="PELICULA_GENERO")
public class Pelicula_Genero {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	private long id_genero;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="id_genero", nullable = false, insertable = false, updatable = false)
	private Genero genero;
	
	private long id_pelicula;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="id_pelicula", nullable = false, insertable = false, updatable = false)
	private Pelicula_Serie pelicula_serie;

	public Pelicula_Genero() {
		super();
	}

	public Pelicula_Genero(Genero genero, Pelicula_Serie pelicula_serie) {
		super();
		this.genero = genero;
		this.pelicula_serie = pelicula_serie;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Pelicula_Serie getPelicula_serie() {
		return pelicula_serie;
	}

	public void setPelicula_serie(Pelicula_Serie pelicula_serie) {
		this.pelicula_serie = pelicula_serie;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getId_pelicula() {
		return id_pelicula;
	}

	public void setId_pelicula(long id_pelicula) {
		this.id_pelicula = id_pelicula;
	}

	public long getId_genero() {
		return id_genero;
	}

	public void setId_genero(long id_genero) {
		this.id_genero = id_genero;
	}
	
}