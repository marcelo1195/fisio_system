package francisco.francisco.fisio.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "pacientes")
@Data
public class Paciente {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false, length = 50)
    private String nome;

    @Column(name = "sobrenome", nullable = false, length = 50)
    private String sobrenome;

    @Column(name = "data_nascimento", nullable = false)
    private LocalDate dataNascimento;

    @Column(name = "plano_de_saude", length = 100)
    private String planoDeSaude;

    @Column(name = "numero_de_sessoes_previstas")
    private Integer numeroDeSessoesPrevistas;

    @Column(name = "data_ultima_sessao")
    private LocalDate dataUltimaSessao;

    @Column(name = "numero_atual_de_sessao")
    private Integer numeroAtualDeSessao;

    @Column(name = "rg", unique = true, length = 20)
    private String rg;

    @Column(name = "cpf", unique = true, length = 11)
    private String cpf;

    @Column(name = "email", unique = true, length = 100)
    private String email;

    @Column(name = "telefone", length = 20)
    private String telefone;

    @Column(name = "endereco", length = 255)
    private String endereco;

    @Column(name = "cep", length = 15)
    private String cep;

    @Column(name = "historico_anterior", columnDefinition = "TEXT")
    private String historicoAnterior;

    @Column(name = "tratamento", columnDefinition = "TEXT")
    private String tratamento;

    @Column(name = "historico_tratamento", columnDefinition = "TEXT")
    private String historidoTratamento;

    @Column(name = "prontuario", columnDefinition = "TEXT")
    private String prontuario;

    @Column(name = "valor_consulta", precision = 10, scale = 2)
    private BigDecimal valorConsulta;

    @Column(name = "valor_sessao", precision = 10, scale = 2)
    private BigDecimal valorSessao;

    @Column(name = "pagamento", length = 50)
    private String pagamento;

    @Column(name = "credito", precision = 10, scale = 2)
    private BigDecimal credito;

    @Column(name = "debito", precision = 10, scale = 2)
    private BigDecimal debito;

    @Column(name = "ativo", nullable = false)
    private Boolean ativo;

}
