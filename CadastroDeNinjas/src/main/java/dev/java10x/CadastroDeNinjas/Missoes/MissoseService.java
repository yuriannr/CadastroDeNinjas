package dev.java10x.CadastroDeNinjas.Missoes;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MissoseService {

    private final MissoesRepository missoesRepository;

    //listar todos
    public List<MissoesModel> listar(){
        return missoesRepository.findAll();
    }
    //adicionar missao
    public MissoesModel adicionar(MissoesModel missao){
        return missoesRepository.save(missao);
    }
    //deletar missao
    public void deletar(Long id) {
        missoesRepository.deleteById(id);
    }
    //listar por ID
    public MissoesModel listarporID(Long id){
        Optional <MissoesModel> missoesID = missoesRepository.findById(id);
        return missoesID.orElse(null);
    }

}
