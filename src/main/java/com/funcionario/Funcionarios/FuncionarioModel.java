package com.funcionario.Funcionarios;

import com.funcionario.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name= "tb_cadastro_de_funcionario")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class FuncionarioModel {

    //atributos funcionario
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    private String nome;
    private String email;
    private int idade;

    @ManyToOne
    @JoinColumn(name="missoes_id")
    private MissoesModel missoes;

}
