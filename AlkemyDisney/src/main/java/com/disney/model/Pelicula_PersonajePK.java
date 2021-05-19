package com.disney.model;

import java.io.Serializable;

import javax.persistence.Column;

public class Pelicula_PersonajePK implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name="personaje_nombre")
	private String nomb_personaje;
	
	@Column(name="pelicula_nombre")
	private String nomb_peli;

	public Pelicula_PersonajePK() {
		super();
	}

	public Pelicula_PersonajePK(String nomb_personaje, String nomb_peli) {
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

	public String getNomb_peli() {
		return nomb_peli;
	}

	public void setNomb_peli(String nomb_peli) {
		this.nomb_peli = nomb_peli;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomb_peli == null) ? 0 : nomb_peli.hashCode());
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
		if (nomb_peli == null) {
			if (other.nomb_peli != null)
				return false;
		} else if (!nomb_peli.equals(other.nomb_peli))
			return false;
		if (nomb_personaje == null) {
			if (other.nomb_personaje != null)
				return false;
		} else if (!nomb_personaje.equals(other.nomb_personaje))
			return false;
		return true;
	}


}
