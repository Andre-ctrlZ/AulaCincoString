package com.example.aulaCincoJava.repository;

import com.example.aulaCincoJava.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}
