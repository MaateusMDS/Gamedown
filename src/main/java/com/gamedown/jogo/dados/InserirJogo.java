/*
Mateus Mendes - RM95138
Eduardo Kenji - RM94180
 */

package com.gamedown.jogo.dados;

import com.gamedown.jogo.model.Genero;
import com.gamedown.jogo.model.Requisitos;
import jakarta.persistence.Embedded;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.*;

import java.time.Year;

public record InserirJogo(
        @NotBlank
        String titulo,
        @NotBlank
        String desenvolvedora,
        String distribuidora,
        @NotBlank
        String idiomas,
        @NotNull @Min(1) @Max(4)
        Integer numJogadores,
        @NotNull @PastOrPresent
        Year dataLancamento,
        @NotNull
        Genero genero,
        @NotNull
        DadosRequisitos requisitos

    ){
}
