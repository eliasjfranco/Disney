package com.disney.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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
	private int edad;
	
	@Column(name="peso")
	private float peso;
	
	@Column(name="historia")
	private String historia;
	
	@OneToMany(mappedBy = "personaje", cascade = CascadeType.ALL)
	private List<Pelicula_Serie> peli;

	public Personaje() {
		super();
	}

	public Personaje(byte[] imagen, String nombre, int edad, float peso, String historia) {
		super();
		this.imagen = imagen;
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.historia = historia;
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

	public List<Pelicula_Serie> getPeli() {
		return peli;
	}

	public void setPeli(List<Pelicula_Serie> peli) {
		this.peli = peli;
	}
	
	

}
