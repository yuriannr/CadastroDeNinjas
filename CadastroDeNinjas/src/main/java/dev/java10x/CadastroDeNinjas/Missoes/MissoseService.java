package dev.java10x.CadastroDeNinjas.Missoes;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MissoseService {

    private final MissoesRepository missoesRepository;

    public List<MissoesModel> listarMissoes(){
        return missoesRepository.findAll();
    }
}
