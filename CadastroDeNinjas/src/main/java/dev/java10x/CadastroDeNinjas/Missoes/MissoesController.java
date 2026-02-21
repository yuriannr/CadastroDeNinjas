package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    @PostMapping("/criar")
    public String criarMissao(){
        return "Criar uma nova missão";
    }

    @GetMapping("/mostrar")
    public String mostrarMissão(){
        return "Mostrar missão";
    }
    @PutMapping("/alterar")
    public String alterarMissao(){
        return "Alterar missão";
    }
    @DeleteMapping("/deletar")
    public String deletarMissao(){
        return "Alterar Missão";
    }

}
