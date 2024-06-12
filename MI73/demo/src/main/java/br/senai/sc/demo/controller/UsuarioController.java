package br.senai.sc.demo.controller;

import br.senai.sc.demo.model.Usuario;
import br.senai.sc.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Determina que a classe sera gerenciada pelo Spring facilitando a idetificação dos endpoints
//Endpoints são interfaces de comunicação
//EndPoints possuem sua rota e um tipo de metodo
@RestController

// Determina qual o endpoint base para todos os outros metodos
@RequestMapping("/usuario")

public class UsuarioController {
    //Composição (conceito de POO)
    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    //Get e delete não podem ter body
    //Get ira retornar os objetos podendo ser um objeto (@GetMapping("/{id}")), uma lista filtrada de objeto (@GetMapping("/{nome da lista}")) ou a lista inteira (@GetMapping)
    @GetMapping("/{id}")
    public Usuario buscarUsuario(@PathVariable Integer id){
        return usuarioService.buscarUsuario(id);
    }

//    @Autowired se não possuir construtor (Agregação em conceito de POO)
    private final UsuarioService usuarioService;
    //Receber as informações e salvar em algum lugar
    // RequestBody informação bruta que estamos recebendo
    @PostMapping
    public String cadatroUsuario(@RequestBody Usuario usuario){
        usuarioService.cadastroUsuario(usuario);
        return "Olá " + usuario.getNome() + ".\n" + usuario;
    }

    // /teste ira antecederr a URI de id
    //id é uma variavel de caminho

    //Serve para alterações maiores
//    @PutMapping("/{idPut}")
//    // o pathvariable não precisa ser o mesmo nome da variavel de caminho
//    public String endpointPut(@PathVariable ("idPut") int id, @RequestBody String nome){
//        return "Olá " + nome + " de ID = "+id+".";
//    }
//    //Serve para pequenas alterações de preferência para somente 1
//    @PatchMapping
//    public String endpointPatch(@RequestParam int id, @RequestBody String nome){
//        return "Olá " + nome + " de ID = "+id+".";
//    }
//    //Delete serve para desabilitar ou seja não exibir para o usuario
//    @DeleteMapping("/{id}")
//    public String endpointDelete(@PathVariable int id){
//        return "Objeto de id "+id+" deletado";
//    }
}
