package br.senai.sc.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.ToString;

//Cria os getters (quando colocado na classe cria para todos os atributos, porem pode ser colocado em cima do atributo que vc quer individualmente)
@Getter

//Gera to string para todos os atributos (@ToString.Include serve para apenas oque você colocar em cima do atributo)
@ToString

//Esta assinatura deduz que a classe pertence ao banco de dados
@Entity

//@Table serve para definir um nome para as tabelas no banco de dados (se não for usado ele assume o nome que esta no código java)
//@Table(name = "tb_usuario")
public class Usuario {

    @Id //Serve para indicar o id e definir primary key, não ser valor nulo e unico no banco

    @GeneratedValue(strategy = GenerationType.IDENTITY) //Incrementa o numero ao id (auto increment) não obrigatório
    private Integer id;

    //@Column serve para definir um nome e outras coisas para os atributos no banco de dados (se não for usado ele assume o nome que esta no código java) não obrigatório
    @Column(precision = 11, updatable = false, unique = true)
    private Long cpf;
    @Column(nullable = false)
    private String nome;
    @Column(unique = true)
    private String email;
    //Não ira exibir a senha no to string
    @ToString.Exclude
    @Column(name = "password")
    private String senha;
    @Column(length = 50)
    private String nomePet;

}
