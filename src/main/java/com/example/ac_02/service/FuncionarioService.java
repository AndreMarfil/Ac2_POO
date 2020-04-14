package com.example.ac_02.service;

import java.util.List;

import com.example.ac_02.entidade.Funcionario;
import com.example.ac_02.repository.FuncionarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * FuncionarioService
 */
@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository repository;
    
    public List<Funcionario> getFuncionarios(){

        return repository.findAll();
    }
    public void CriaFuncionario(Funcionario funci){

        repository.save(funci); //salvando objeto inteiro no repository
    }
}