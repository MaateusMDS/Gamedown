/*
Mateus Mendes - RM95138
Eduardo Kenji - RM94180
 */

package com.gamedown.jogo.dados;

import com.gamedown.jogo.model.Genero;
import com.gamedown.jogo.model.Jogo;

public record ListarJogos(

    Long id,
    String titulo,
    String desenvolvedora,
    int numJogadores,
    Genero genero,
    int armazenamento
    ){
    public ListarJogos(Jogo jogo){
        this (
                jogo.getId(),
                jogo.getTitulo(),
                jogo.getDesenvolvedora(),
                jogo.getNumJogadores(),
                jogo.getGenero(),
                jogo.getRequisitos().getArmazenamento()
        );
    }
}
