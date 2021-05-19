package com.disney.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;

import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Id;

import javax.persistence.Table;

import javax.persistence.Entity;

@Entity
@Table(name="GENERO")
public class Genero {

	@Id
	@Column(name="nombre")
	private String nombre;
	
	@Lob
	@Column(name="img")
	private byte[] imagen;
	
	@OneToMany(mappedBy = "genero", cascade = CascadeType.ALL)
	private List<Pelicula_Serie> peli;

	public Genero() {
		super();
	}

	public Genero(String nombre, byte[] imagen, List<Pelicula_Serie> peli) {
		super();
		this.nombre = nombre;
		this.imagen = imagen;
		this.peli = peli;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public byte[] getImagen() {
		return imagen;
	}

	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}

	public List<Pelicula_Serie> getPeli() {
		return peli;
	}

	public void setPeli(List<Pelicula_Serie> peli) {
		this.peli = peli;
	}
	
	
	
}
