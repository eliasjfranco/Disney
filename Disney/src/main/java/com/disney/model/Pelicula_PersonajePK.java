package com.disney.model;

import java.io.Serializable;

import javax.persistence.Column;

public class Pelicula_PersonajePK implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="nombre_personaje")
	private String nomb_personaje;
	
	@Column(name="nombre_pelicula")
	private String nomb_pelicula;

	public Pelicula_PersonajePK() {
		super();
	}

	public Pelicula_PersonajePK(String nomb_personaje, String nomb_pelicula) {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomb_pelicula == null) ? 0 : nomb_pelicula.hashCode());
		result = prime * result + ((nomb_personaje == null) ? 0 : nomb_personaje.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pelicula_PersonajePK other = (Pelicula_PersonajePK) obj;
		if (nomb_pelicula == null) {
			if (other.nomb_pelicula != null)
				return false;
		} else if (!nomb_pelicula.equals(other.nomb_pelicula))
			return false;
		if (nomb_personaje == null) {
			if (other.nomb_personaje != null)
				return false;
		} else if (!nomb_personaje.equals(other.nomb_personaje))
			return false;
		return true;
	}
	
	

}
