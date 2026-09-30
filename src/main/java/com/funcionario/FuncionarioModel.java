package com.funcionario;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name= "tb_cadastro_de_funcionario")
public class FuncionarioModel {
    //atributos funcionario
    long id;
    private String nome;
    private String email;
    private int idade;

    //constutor

    public FuncionarioModel(long id, int idade, String email, String nome) {
        this.id = id;
        this.idade = idade;
        this.email = email;
        this.nome = nome;
    }

    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
