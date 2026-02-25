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
    @PostMapping("/criar")
    public NinjaModel criarNinja(@RequestBody NinjaModel ninja){
        return ninjaService.criarNinja(ninja);
    }

    //Mostrar todos os Ninjas (READ)
    @GetMapping("/listar")
    public List <NinjaModel> listarNinjas(){
        return ninjaService.listarNinjas();
    }

    //Mostrar Ninjas por ID (READ)
    @GetMapping("/listar/{id}")
    public NinjaModel listarporID(@PathVariable Long id){
        return ninjaService.listarPorID(id);

    }

    //Alterar Ninjas (UPDATE)
    @PutMapping("/alterar/{id}")
    public NinjaModel atualizarNinja(@PathVariable Long id, @RequestBody NinjaModel ninjaAtualizado){
        return ninjaService.atualizarNinja(id, ninjaAtualizado);
    }

    //Deletar um Ninjas (DELETE)
    @DeleteMapping("/deletar/{id}")
    public void deleteNinja(@PathVariable Long id) {
        ninjaService.deletarNinja(id);
    }

}