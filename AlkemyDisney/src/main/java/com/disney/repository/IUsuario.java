package com.disney.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.disney.model.Usuario;

@Repository
public interface IUsuario extends JpaRepository<Usuario, Long>{

	Usuario findByUsuario(String username);
}