package dev.java10x.CadastroDeNinjas.Ninjas;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class NinjaService {

    private final NinjaRepository ninjaRepository; //injeção de dependencia Respository

    public List<NinjaModel> listarNinjas(){
        return ninjaRepository.findAll();
    }
}
