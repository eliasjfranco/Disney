package com.disney.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="PERSONAJE")
public class Personaje {

	@Lob
	@Column(name="img")
	private byte[] imagen;
	
	@Id
	@Column(name="nombre")
	private String nombre;

	@Column(name="edad")
	private Integer edad;
	
	@JsonIgnore
	@Column(name="peso")
	private float peso;
	
	@JsonIgnore
	@Column(name="historia")
	private String historia;
	
	@JsonIgnore
	@OneToMany(mappedBy = "personaje")
	private List<Pelicula_Personaje> peli;

	public Personaje() {
		super();
	}

	public Personaje(byte[] imagen, String nombre, Integer edad, float peso, String historia,
			List<Pelicula_Personaje> peli_personaje) {
		super();
		this.imagen = imagen;
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.historia = historia;
		this.peli = peli_personaje;
	}

	public byte[] getImagen() {
		return imagen;
	}

	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getHistoria() {
		return historia;
	}

	public void setHistoria(String historia) {
		this.historia = historia;
	}

	public List<Pelicula_Personaje> getPeli_personaje() {
		return peli;
	}

	public void setPeli_personaje(List<Pelicula_Personaje> peli_personaje) {
		this.peli = peli_personaje;
	}
	
	
	
}
