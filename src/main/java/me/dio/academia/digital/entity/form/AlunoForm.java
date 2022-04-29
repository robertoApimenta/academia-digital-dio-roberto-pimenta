package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {

  @NotBlank(message = "Preencha o nome do aluno.")
  @Size(min = 3, max = 50, message = "'${ValidatedValue}' precisa entar entre {min} e {max}")
  private String nome;

  @NotBlank(message = "Preencha o CPF do aluno.")
  @CPF(message = "'${ValidatedValue}' inválido")
  private String cpf;

  @NotBlank(message = "Preencha o bairro do aluno.")
  @Size(min = 3, max = 50, message = "'${ValidatedValue}' precisa entar entre {min} e {max}")
  private String bairro;

  @NotNull(message = "Preencha a data corretamente")
  @Past(message = "Data '${ValidatedValue}' inválida")
  private LocalDate dataDeNascimento;
}

















