package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaForm {

  @NotNull(message = "Preencha o id do aluno")
  @Positive(message = "O id do aluno precisa ser positivo")
  private Long alunoId;

  @NotNull(message = "Preencha o peso do aluno")
  @Positive(message = "O peso '${ValidatedValue}' do aluno precisa ser positivo")
  private double peso;

  @NotNull(message = "Preencha a açtura do aluno")
  @Positive(message = "A altura '${ValidatedValue}' do aluno precisa ser positivo")
  @DecimalMin(value = "150", message = "Precisa ser no minimo 150")
  private double altura;
}
