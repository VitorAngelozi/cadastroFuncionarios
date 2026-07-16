package dev.angelozi.cadastroDeFuncionarios;

import jakarta.persistence.Entity;

//entity transforme a class into an db entity
@Entity
@Table
public class FuncionarioModel {

    String nome;
    String email;
    int idade;

    public FuncionarioModel(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public FuncionarioModel() {
    }

}
