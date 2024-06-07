package br.senai.sc.demo.controller;

import org.springframework.web.bind.annotation.*;

//Determina que a classe sera gerenciada pelo Spring facilitando a idetificação dos endpoints
//Endpoints são interfaces de comunicação
//EndPoints possuem sua rota e um tipo de metodo
@RestController

// Determina qual o endpoint base para todos os outros metodos
@RequestMapping("/teste")

public class PrimeiroEndpointController {

    //Get e delete não podem ter body
    //Get ira retornar os objetos podendo ser um objeto (@GetMapping("/{id}")), uma lista filtrada de objeto (@GetMapping("/{nome da lista}")) ou a lista inteira (@GetMapping)
    @GetMapping
    public String endpointGet(){
        return "GET";
    }

    //Receber as informações e salvar em algum lugar
    // RequestBody informação bruta que estamos recebendo
    @PostMapping
    public String endpointPost(@RequestBody String nome){
        return "Olá " + nome + ".";
    }

    // /teste ira antecederr a URI de id
    //id é uma variavel de caminho

    //Serve para alterações maiores
    @PutMapping("/{idPut}")
    // o pathvariable não precisa ser o mesmo nome da variavel de caminho
    public String endpointPut(@PathVariable ("idPut") int id, @RequestBody String nome){
        return "Olá " + nome + " de ID = "+id+".";
    }
    //Serve para pequenas alterações de preferência para somente 1
    @PatchMapping
    public String endpointPatch(@RequestParam int id, @RequestBody String nome){
        return "Olá " + nome + " de ID = "+id+".";
    }
    //Delete serve para desabilitar ou seja não exibir para o usuario
    @DeleteMapping("/{id}")
    public String endpointDelete(@PathVariable int id){
        return "Objeto de id "+id+" deletado";
    }
}
