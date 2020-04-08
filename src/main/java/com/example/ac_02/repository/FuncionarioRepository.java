package com.example.ac_02.repository;

import com.example.ac_02.entidade.Funcionario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario,Integer>{

}