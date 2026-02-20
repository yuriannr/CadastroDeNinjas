package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class MissoesController {

    @PostMapping("/criarmissao")
    public String criarMissao(){
        return "Criar uma nova missão";
    }

    @GetMapping("/mostrarmissão")
    public String mostrarMissão(){
        return "Mostrar missão";
    }
    @PutMapping("/alterarmissao")
    public String alterarMissao(){
        return "Alterar missão";
    }
    @DeleteMapping("/deletarmissao")
    public String deletarMissao(){
        return "Alterar Missão";
    }

}
