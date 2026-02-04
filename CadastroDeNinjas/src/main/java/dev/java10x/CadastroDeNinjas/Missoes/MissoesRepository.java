package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.data.jpa.repository.JpaRepository;
//JPA - Simplificador, quando estamos trabalhando com DB
public interface MissoesRepository extends JpaRepository<MissoesModel, Long> {
}
