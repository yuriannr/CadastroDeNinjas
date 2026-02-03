package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Controlador para API Rest
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas") //Pegar Informações
    public String boasVindas(){
        return "Essa é minha primeira mensagem nessa rota";
    }
}