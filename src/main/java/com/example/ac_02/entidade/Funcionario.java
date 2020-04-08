package com.example.ac_02.entidade;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Funcionario implements Serializable{
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    private int matricula;
    private String cpf;
    private String nome;
    private String setor;
    private int idade;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Funcionario(int matricula, String cpf, String nome, String setor, int idade) {
        this.matricula = matricula;
        this.cpf = cpf;
        this.nome = nome;
        this.setor = setor;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Funcionarios [cpf=" + cpf + ", idade=" + idade + ", matricula=" + matricula + ", nome=" + nome + ", setor=" + setor + "]";
    }

    

}