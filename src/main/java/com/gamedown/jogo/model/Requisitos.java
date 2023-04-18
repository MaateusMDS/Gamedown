package com.gamedown.jogo.model;

public class Requisitos {

    private String sistemaOperacional;
    private String processador;
    private String memoria;
    private String placaDeVideo;
    private int armazenamento;


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
