package com.funcionario.Funcionarios;

import com.funcionario.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.CustomLog;
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

    @Column(name="nome")
    private String nome;

    @Column(name="email", unique = true)
    private String email;

    @Column(name="idade")
    private int idade;

    @Column(name="img_url")
    private String imgUrl;

    @ManyToOne
    @JoinColumn(name="missoes_id")
    private MissoesModel missoes;

}
