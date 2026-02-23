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
    public MissoesModel adicionarMissao(@RequestBody MissoesModel missao){
        return missoesService.adicionar(missao);
    }

    @GetMapping("/listar")
    public List <MissoesModel> litarMissoes(){
        return missoesService.listar();
    }

    @GetMapping("/listar/{id}")
    public MissoesModel listarPorID(@PathVariable Long id){
        return missoesService.listarporID(id);
    }
    @PutMapping("/alterar")
    public String alterarMissao(){
        return "Alterar missão";
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarMissao(@PathVariable Long id) {
        missoesService.deletar(id);
    }

}
