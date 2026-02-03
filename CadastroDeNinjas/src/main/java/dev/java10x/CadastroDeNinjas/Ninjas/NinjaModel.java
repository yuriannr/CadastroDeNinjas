package dev.java10x.CadastroDeNinjas.Ninjas;
//JPA = Java Persistence API
import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //Transforma a classe em entidade no DB, criando uma tabela no DB
@Table(name ="tb_cadastro") //Nomeação da Tabela
//Lomboks anotations
@Data //cria os Getters e Setters
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //estrategia de ordenação de ID
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    private int idade;
    //Muitos ninjas para a mesma missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") //Foreign Key ou chave estrangeira.
    private MissoesModel missoes;
}