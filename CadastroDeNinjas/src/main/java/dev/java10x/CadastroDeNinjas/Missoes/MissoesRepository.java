package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//JPA - Simplificador, quando estamos trabalhando com DB
@Repository
public interface MissoesRepository extends JpaRepository<MissoesModel, Long> {
}
