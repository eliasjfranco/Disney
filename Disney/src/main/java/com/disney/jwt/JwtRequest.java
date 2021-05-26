package com.disney.jwt;

import java.io.Serializable;

public class JwtRequest implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String username;
	private String pwd;
	
	public JwtRequest() {
		super();
	}
	public JwtRequest(String username, String pwd) {
		super();
		this.username = username;
		this.pwd = pwd;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
	

}