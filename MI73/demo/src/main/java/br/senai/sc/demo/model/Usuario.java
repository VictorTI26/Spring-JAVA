package br.senai.sc.demo.model;

import jakarta.persistence.*;

//Esta assinatura deduz que a classe pertence ao banco de dados
@Entity
//@Table serve para definir um nome para as tabelas no banco de dados (se não for usado ele assume o nome que esta no código java)
//@Table(name = "tb_usuario")
public class Usuario {
    @Id //Serve para indicar o id e definir primary key, não ser valor nulo e unico no banco
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Incrementa o numero ao id (auto increment)
    private Integer id;
    //@Column serve para definir um nome e outras coisas para os atributos no banco de dados (se não for usado ele assume o nome que esta no código java)
    @Column(precision = 11, updatable = false, unique = true)
    private Long cpf;
    @Column(nullable = false)
    private String nome;
    @Column(unique = true)
    private String senha;
    @Column(name = "password")
    private String email;
    @Column(length = 20)
    private String nomePet;

}
