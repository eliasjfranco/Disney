package com.disney.model;

import javax.persistence.Table;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

@Entity
@Table(name="PELICULA_SERIE")
public class Pelicula_Serie {
	
	@Lob
	@Column(name="img")
	private byte[] imagen;
	
	@Id
	@Column(name="titulo")
	private String titulo;

	@Column(name="fecha")
	private Date fecha;
	
	@Column(name="calificacion")
	private int calificacion;
	
	@OneToMany(mappedBy = "pelicula_serie")
	private List<Pelicula_Genero> peli_genero;
	
	@OneToMany(mappedBy = "pelicula_serie")
	private List<Pelicula_Personaje> peli_personaje;

	public Pelicula_Serie() {
		super();
	}

	public Pelicula_Serie(byte[] imagen, String titulo, Date fecha, int calificacion, List<Pelicula_Genero> peli_genero,
			List<Pelicula_Personaje> peli_personaje) {
		super();
		this.imagen = imagen;
		this.titulo = titulo;
		this.fecha = fecha;
		this.calificacion = calificacion;
		this.peli_genero = peli_genero;
		this.peli_personaje = peli_personaje;
	}

	public byte[] getImagen() {
		return imagen;
	}

	public void setImagen(byte[] imagen) {
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

	public List<Pelicula_Personaje> getPeli_personaje() {
		return peli_personaje;
	}

	public void setPeli_personaje(List<Pelicula_Personaje> peli_personaje) {
		this.peli_personaje = peli_personaje;
	}

	public List<Pelicula_Genero> getPeli_genero() {
		return peli_genero;
	}

	public void setPeli_genero(List<Pelicula_Genero> peli_genero) {
		this.peli_genero = peli_genero;
	}
	
	
	
	
	
	
	
}
