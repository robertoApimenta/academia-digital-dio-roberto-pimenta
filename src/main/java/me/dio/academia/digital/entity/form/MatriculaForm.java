package me.dio.academia.digital.entity.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class MatriculaForm {

  @NotNull(message = "Preencha o id do aluno")
  @Positive(message = "O id do aluno precisa ser positivo")
  private Long alunoId;

}
