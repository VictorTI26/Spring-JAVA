package br.senai.sc.demo.repository;

import br.senai.sc.demo.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Assinatura responsavel para mostrar que é um repository
@Repository

//dentro dos <> qual a classe vai poder manipular e qual o tipo do atributo identificador
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
