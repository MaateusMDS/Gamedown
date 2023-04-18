package com.gamedown.jogo.dados;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosRequisitos(

     String sistemaOperacional,
     @NotBlank
     String processador,
     @NotBlank
     String memoria,
     @NotBlank
     String placaDeVideo,
     @NotNull @Min(1)
     Integer armazenamento
    ){ }
