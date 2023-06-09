/*
Mateus Mendes - RM95138
Eduardo Kenji - RM94180
 */

package com.gamedown.jogo.model;

import com.gamedown.jogo.dados.AtualizarJogo;
import com.gamedown.jogo.dados.DadosRequisitos;
import jakarta.persistence.Embeddable;

@Embeddable
public class Requisitos {

    private String sistemaOperacional;
    private String processador;
    private String memoria;
    private String placaDeVideo;
    private int armazenamento;

    public Requisitos() {
    }

    public Requisitos(DadosRequisitos dados) {
        this.sistemaOperacional = dados.sistemaOperacional();
        this.processador = dados.processador();
        this.memoria = dados. memoria();
        this.placaDeVideo = dados.placaDeVideo();
        this.armazenamento = dados.armazenamento();
    }

    public void atualizarJogo(DadosRequisitos dados) {
        if (dados.armazenamento() != null) {
            this.armazenamento = dados.armazenamento();
        }
        if (dados.memoria() != null) {
            this.memoria = dados.memoria();
        }
        if (dados.sistemaOperacional() != null) {
            this.sistemaOperacional = dados.sistemaOperacional();
        }
        if (dados.placaDeVideo() != null) {
            this.placaDeVideo = dados.placaDeVideo();
        }
        if (dados.processador() != null) {
            this.processador = dados.processador();
        }
    }

    public Requisitos(String sistemaOperacional, String processador, String memoria, String placaDeVideo, int armazenamento) {
        this.sistemaOperacional = sistemaOperacional;
        this.processador = processador;
        this.memoria = memoria;
        this.placaDeVideo = placaDeVideo;
        this.armazenamento = armazenamento;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public Requisitos setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
        return this;
    }

    public String getProcessador() {
        return processador;
    }

    public Requisitos setProcessador(String processador) {
        this.processador = processador;
        return this;
    }

    public String getMemoria() {
        return memoria;
    }

    public Requisitos setMemoria(String memoria) {
        this.memoria = memoria;
        return this;
    }

    public String getPlacaDeVideo() {
        return placaDeVideo;
    }

    public Requisitos setPlacaDeVideo(String placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
        return this;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public Requisitos setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
        return this;
    }
}
