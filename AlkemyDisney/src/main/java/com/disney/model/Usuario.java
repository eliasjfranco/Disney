package com.disney.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="USUARIO")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="usuario")
	private String usuario;
	
	@JsonIgnore
	@Column(name="password")
	private String pwd;
	
	@Column(name="email")
	private String email;

	public Usuario() {
		super();
	}

	public Usuario(String usuario, String pwd, String correo) {
		super();
		this.usuario = usuario;
		this.pwd = pwd;
		this.email = correo;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getCorreo() {
		return email;
	}

	public void setCorreo(String correo) {
		this.email = correo;
	}

	
	
}