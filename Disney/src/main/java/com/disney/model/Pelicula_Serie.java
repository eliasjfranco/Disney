package com.disney.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="PELICULA_SERIE")
public class Pelicula_Serie {

	@Lob
	@Column(name="img")
	private Byte[] imagen;
	
	@Id
	@Column(name="titulo")
	private String titulo;
	
	@Column(name="fecha_creacion")
	private Date fecha;
	
	@Column(name="calificacion")
	private int calificacion;
	
	@ManyToOne
	@JoinColumn(name="titulo")
	private Genero genero;
	
	@ManyToOne
	@JoinColumn(name="personaje")
	private Personaje personaje;
	
	@OneToMany(mappedBy = "peli_serie", cascade = CascadeType.ALL)
	private List<Pelicula_Personaje> peli_personaje;

	public Pelicula_Serie() {
		super();
	}

	public Pelicula_Serie(Byte[] imagen, String titulo, Date fecha, int calificacion, Genero genero) {
		super();
		this.imagen = imagen;
		this.titulo = titulo;
		this.fecha = fecha;
		this.calificacion = calificacion;
		this.genero = genero;
	}

	public Byte[] getImagen() {
		return imagen;
	}

	public void setImagen(Byte[] imagen) {
		this.imagen = imagen;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Personaje getPersonaje() {
		return personaje;
	}

	public void setPersonaje(Personaje personaje) {
		this.personaje = personaje;
	}

	public List<Pelicula_Personaje> getPeli_personaje() {
		return peli_personaje;
	}

	public void setPeli_personaje(List<Pelicula_Personaje> peli_personaje) {
		this.peli_personaje = peli_personaje;
	}
	
	
	
}
