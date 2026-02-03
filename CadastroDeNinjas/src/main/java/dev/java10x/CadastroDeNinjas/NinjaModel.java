package dev.java10x.CadastroDeNinjas;
//JPA = Java Persistence API
import jakarta.persistence.*;

@Entity //Transforma a classe em entidade no DB, criando uma tabela no DB
@Table(name ="tb_cadastro") //Nomeação da Tabela
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //estrategia de ordenação de ID
    private Long id;
    private String name;
    private String email;
    private int idade;

    public NinjaModel(String name, String email, int idade) {
        this.name = name;
        this.email = email;
        this.idade = idade;
    }

    public NinjaModel() {
    }

    public String getNome() {
        return name;
    }

    public void setNome(String nome) {
        this.name = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
