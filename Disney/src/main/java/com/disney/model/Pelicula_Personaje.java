package com.disney.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="PELICULA_PERSONAJE")
@IdClass(Pelicula_PersonajePK.class)
public class Pelicula_Personaje {

	@Id
	@Column(name="nombre_personaje")
	private String nomb_personaje;
	
	@Id
	@Column(name="nombre_pelicula")
	private String nomb_pelicula;
	
	@ManyToOne
	@JoinColumn(name="nombre_personaje", insertable = false, updatable = false, nullable = false)
	private Personaje personaje;
	
	@ManyToOne
	@JoinColumn(name="nombre_pelicula", insertable = false, updatable = false, nullable = false)
	private Pelicula_Serie peli_serie;

	public Pelicula_Personaje() {
		super();
	}

	public Pelicula_Personaje(String nomb_personaje, String nomb_pelicula) {
		super();
		this.nomb_personaje = nomb_personaje;
		this.nomb_pelicula = nomb_pelicula;
	}

	public String getNomb_personaje() {
		return nomb_personaje;
	}

	public void setNomb_personaje(String nomb_personaje) {
		this.nomb_personaje = nomb_personaje;
	}

	public String getNomb_pelicula() {
		return nomb_pelicula;
	}

	public void setNomb_pelicula(String nomb_pelicula) {
		this.nomb_pelicula = nomb_pelicula;
	}

	public Personaje getPersonaje() {
		return personaje;
	}

	public void setPersonaje(Personaje personaje) {
		this.personaje = personaje;
	}

	public Pelicula_Serie getPeli_serie() {
		return peli_serie;
	}

	public void setPeli_serie(Pelicula_Serie peli_serie) {
		this.peli_serie = peli_serie;
	}
	
}
