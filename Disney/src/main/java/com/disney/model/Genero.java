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
@Table(name="GENERO")
public class Genero {

	@Lob
	@Column(name="img")
	private Byte[] imagen;
	
	@Id
	@Column(name="nombre")
	private String nombre;
	
	@OneToMany(mappedBy = "genero", cascade = CascadeType.ALL)
	private List<Pelicula_Serie> peli;
}
