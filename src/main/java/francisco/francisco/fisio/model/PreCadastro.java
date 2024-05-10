package francisco.francisco.fisio.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Table(name = "pre_cadastros")
@Data
public class PreCadastro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "nome", nullable = false, length = 50)
    private String nome;

    @Column(name = "sobrenome", nullable = false, length = 50)
    private String sobrenome;

    @Column(name = "data_nascimento", nullable = false)
    private LocalDate dataNascimento;

    @Column(name = "plano_de_saude", length = 100)
    private String planoDeSaude;

    @Column(name = "rg", unique = true, length = 20)
    private String rg;

    @Column(name = "cpf", unique = true, length = 11)
    private String cpf;

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "telefone", length = 15)
    private String telefone;

    @Column(name = "endereco", length = 255)
    private String endereco;

    @Column(name = "cep", length = 10)
    private String cep;

    @Column(name = "consulta_paga", nullable = false)
    private Boolean consultaPaga;


    @Column(name = "informacoes_adicionais", columnDefinition = "TEXT")
    private String informacoesAdicionais;

}
