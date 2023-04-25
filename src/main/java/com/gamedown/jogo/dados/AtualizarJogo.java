/*
Mateus Mendes - RM95138
Eduardo Kenji - RM94180
 */

package com.gamedown.jogo.dados;

import com.gamedown.jogo.model.Genero;
import jakarta.validation.constraints.*;

import java.time.Year;

public record AtualizarJogo(
        String titulo,
        String desenvolvedora,
        String distribuidora,
        String idiomas,
        @Min(1) @Max(4)
        Integer numJogadores,
        @PastOrPresent
        Year dataLancamento,
        Genero genero,
        DadosRequisitos requisitos
) {



}
