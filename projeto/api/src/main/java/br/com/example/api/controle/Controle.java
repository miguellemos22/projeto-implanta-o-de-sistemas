package br.com.example.api.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.example.api.modelo.Pessoa;


@RestController
public class Controle {
    @GetMapping("")
    public String mensagem(){
        return "ola mundo";
    }
    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "seja bem vindo (A) ";
    }

    @GetMapping("/boasVindas/{migs}")
    public String boasVindas(@PathVariable String migs){
        return "seja bem vindo (A) "+migs;
    }
    @PostMapping("/pessoa")
    public Pessoa pessoa(@RequestBody Pessoa p){
        return p;
    }
    
}
