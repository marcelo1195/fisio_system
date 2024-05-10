package francisco.francisco.fisio.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.math.BigDecimal;
import java.time.LocalDate;
@Data
public class PacienteDTO {

    private Long id;

    @NotBlank(message = "O nome é obrigatório.")
    private String nome;

    @NotBlank(message = "O sobrenome é obrigatório.")
    private String sobrenome;

    @NotBlank(message = "A data de nascimento é obrigatória.")
    private LocalDate dataNascimento;

    @Length(max = 100, message = "O plano de saude deve ter no maximo 100 caracteres")
    private String planoDeSaude;

    private Integer numeroDeSessoesPrevistas;
    private LocalDate dataUltimaSessao;
    private Integer numeroAtualDeSessao;

    @NotBlank(message = "O RG é obrigatório.")
    @Length(min = 9, max = 20, message = "O RG deve ter entre 9 e 20 caracteres.")
    private String rg;

    @NotBlank(message = "O CPF é obrigatório.")
    @Pattern(regexp = "[0-9]{11}", message = "O CPF deve ter 11 números.")
    private String cpf;

    @Email(message = "Endereço de e-mail inválido.")
    private String email;

    @Pattern(regexp = "\\d{10,20}", message = "O telefone deve ter entre 10 e 20 dígitos.")
    private String telefone;

    @Length(max = 255, message = "O endereço deve ter no máximo 255 caracteres.")
    private String endereco;

    @Pattern(regexp = "\\d{5}-\\d{3}", message = "O CEP deve estar no formato 12345-678.")
    private String cep;

    private String historicoAnterior;
    private String tratamento;
    private String historicoTratamento;
    private String prontuario;

    @Positive(message = "O valor da consulta deve ser positivo.")
    private BigDecimal valorConsulta;

    @Positive(message = "O valor da sessão deve ser positivo.")
    private BigDecimal valorSessao;

    @Length(max = 50, message = "Tipo de pagamento: cartão, PIX, Dinheiro")
    private String pagamento;

    @Positive(message = "O valor do credito deve ser positivo.")
    private BigDecimal credito;

    @Positive(message = "O valor do debito deve ser positivo.")
    private BigDecimal debito;

    private Boolean ativo;
}
