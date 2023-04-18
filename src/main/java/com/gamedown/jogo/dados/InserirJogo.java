package com.gamedown.jogo.dados;

import com.gamedown.jogo.model.Genero;
import com.gamedown.jogo.model.Requisitos;
import jakarta.persistence.Embedded;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.time.Year;

public record InserirJogo(

     Long id,
     String titulo,
     String desenvolvedora,
     String distribuidora,
     String idiomas,
     int numJogadores,
     Year dataLancamento,
     Genero genero,
     Requisitos requisitos

    ){
}
