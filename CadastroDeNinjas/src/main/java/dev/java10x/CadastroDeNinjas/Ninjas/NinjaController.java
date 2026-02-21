package dev.java10x.CadastroDeNinjas.Ninjas;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController //Controlador para API Rest
@RequestMapping("/ninja")
@RequiredArgsConstructor
public class NinjaController {
    private final NinjaService ninjaService;


    @GetMapping("/boasvindas") //Pegar Informações
    public String boasVindas(){
        return "Essa é minha primeira mensagem nessa rota";
    }

    //Adicionar novo Ninja(CREATE)
    @PostMapping("/add")
    public String add(){
        return "Adicionar ninja";
    }

    //Mostrar todos os Ninjas (READ)
    @GetMapping("/listar")
    public List <NinjaModel> listarNinjas(){
        return ninjaService.listarNinjas();
    }

    //Mostrar Ninjas por ID (READ)
    @GetMapping("/ninjasporid")
    public String ninjasPorID(){
        return "Mostrar Ninjas por ID";
    }

    //Alterar Ninjas (UPDATE)
    @PutMapping("/alterarninjaporid")
    public String alterarPorID(){
        return "Alterar ninja por ID";
    }

    //Deletar um Ninjas (DELETE)
    @DeleteMapping("/deletarnijaporid")
    public String deleteNinjaPorID(){
        return "Deletar Ninja por ID";
    }
}