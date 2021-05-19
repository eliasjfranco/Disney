package com.disney.security;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.disney.model.Usuario;
import com.disney.repository.IUsuario;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Autowired
	private IUsuario usuarioRepo;
	
	@Autowired
	private PasswordEncoder bcryptEncoder;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario user = usuarioRepo.findByUsuario(username);
		if(user == null) {
			throw new UsernameNotFoundException("Usuario no encontrado");
		}
		return new org.springframework.security.core.userdetails.User(user.getUsuario(), user.getPwd(), new ArrayList<>());
	}

	public Usuario save(User user) {
		Usuario usuario = new Usuario();
		usuario.setUsuario(user.getUsername());
		usuario.setPwd(bcryptEncoder.encode(user.getPwd()));
		return usuarioRepo.save(usuario);
	}
	
	
}
