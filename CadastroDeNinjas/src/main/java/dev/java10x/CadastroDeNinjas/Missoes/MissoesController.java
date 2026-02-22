package dev.java10x.CadastroDeNinjas.Missoes;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/missoes")
@RequiredArgsConstructor
public class MissoesController {

    private final MissoseService missoesService;


    @PostMapping("/criar")
    public String criarMissao(){
        return "Criar uma nova missão";
    }

    @GetMapping("/listar")
    public List <MissoesModel> litarMissoes(){
        return missoesService.listarMissoes();
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
