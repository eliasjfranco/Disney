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
	@Column(name="personaje_nombre")
	private String nomb_personaje;
	
	@ManyToOne()
	@JoinColumn(name="personaje_nombre", insertable = false, updatable = false, nullable = false)
	private Personaje personaje;
	
	@Id
	@Column(name="pelicula_nombre")
	private String nomb_peli;
	
	@ManyToOne
	@JoinColumn(name="pelicula_nombre", insertable = false, updatable = false, nullable = false)
	private Pelicula_Serie pelicula_serie;

	public Pelicula_Personaje() {
		super();
	}

	public Pelicula_Personaje(String nomb_personaje, String nomb_peli) {
		super();
		this.nomb_personaje = nomb_personaje;
		this.nomb_peli = nomb_peli;
	}

	public String getNomb_personaje() {
		return nomb_personaje;
	}

	public void setNomb_personaje(String nomb_personaje) {
		this.nomb_personaje = nomb_personaje;
	}

	public Personaje getPersonaje() {
		return personaje;
	}

	public void setPersonaje(Personaje personaje) {
		this.personaje = personaje;
	}

	public String getNomb_peli() {
		return nomb_peli;
	}

	public void setNomb_peli(String nomb_peli) {
		this.nomb_peli = nomb_peli;
	}

	public Pelicula_Serie getPelicula_serie() {
		return pelicula_serie;
	}

	public void setPelicula_serie(Pelicula_Serie pelicula_serie) {
		this.pelicula_serie = pelicula_serie;
	}
	
	
	
	
}
