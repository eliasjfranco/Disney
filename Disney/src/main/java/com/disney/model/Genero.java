package com.disney.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;

import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Id;

import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="GENERO")
public class Genero {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_genero")
	private long id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Lob
	@Column(name="img")
	private byte[] imagen;
	
	@JsonIgnore
	@OneToMany(mappedBy = "genero", cascade = CascadeType.ALL)
	private List<Pelicula_Genero> peli;

	public Genero() {
		super();
	}

	public Genero(String nombre, byte[] imagen, List<Pelicula_Genero> peli) {
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

	public List<Pelicula_Genero> getPeli() {
		return peli;
	}

	public void setPeli(List<Pelicula_Genero> peli) {
		this.peli = peli;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
}