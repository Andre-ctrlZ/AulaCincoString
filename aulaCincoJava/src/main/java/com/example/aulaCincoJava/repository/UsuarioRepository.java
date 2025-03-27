package com.example.aulaCincoJava.repository;

import com.example.aulaCincoJava.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
