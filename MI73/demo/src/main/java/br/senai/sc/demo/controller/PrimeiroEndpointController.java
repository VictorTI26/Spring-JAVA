package br.senai.sc.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teste")
public class PrimeiroEndpointController {

    @GetMapping
    public String endpointGet(){
        return "GET";
    }

    @PostMapping
    public String endpointPost(@RequestBody String nome){
        return "Olá " + nome + ".";
    }

    @PutMapping("/{id}")
    public String endpointPut(@PathVariable int id, @RequestBody String nome){
        return "Olá " + nome + " de ID = "+id+".";
    }

    @PatchMapping("/{id}")
    public String endpointPatch(@PathVariable int id, @RequestBody String nome){
        return "Olá " + nome + " de ID = "+id+".";
    }

    @DeleteMapping("/{id}")
    public String endpointDelete(@PathVariable int id){
        return "Objeto de id "+id+" deletado";
    }
}
