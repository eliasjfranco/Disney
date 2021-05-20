package com.disney.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="PELICULA_PERSONAJE")
public class Pelicula_Personaje {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_pelicula")
	private Long id;
	
	@ManyToOne()
	@JoinColumn(name="personaje_nombre")
	private Personaje personaje;
	
	@ManyToOne
	@JoinColumn(name="pelicula_nombre")
	private Pelicula_Serie pelicula_serie;

	public Pelicula_Personaje() {
		super();
	}

	public Pelicula_Personaje(Personaje personaje, Pelicula_Serie pelicula_serie) {
		super();
		this.personaje = personaje;
		this.pelicula_serie = pelicula_serie;
	}

	public Personaje getPersonaje() {
		return personaje;
	}

	public void setPersonaje(Personaje personaje) {
		this.personaje = personaje;
	}

	public Pelicula_Serie getPelicula_serie() {
		return pelicula_serie;
	}

	public void setPelicula_serie(Pelicula_Serie pelicula_serie) {
		this.pelicula_serie = pelicula_serie;
	}
	
	
	
	
}
