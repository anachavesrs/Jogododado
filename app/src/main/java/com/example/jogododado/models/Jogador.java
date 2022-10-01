package com.example.jogododado.models;

public class Jogador {
    private String nome;
    private String genero;
    private String palpite;
    private String pontos;

    public Jogador(String nome, String genero, String palpite, String pontos) {
        this.nome = nome;
        this.genero = genero;
        this.palpite = palpite;
        this.pontos = pontos;
    }

    public Jogador() {}

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public String getPalpite() {
        return palpite;
    }

    public String getPontos() {
        return pontos;
    }

    public void setPontos(String pontos) {
        this.pontos = pontos;
    }


    public void setNome(String nome) {
        this.nome = nome;

    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPalpite(String palpite) {
        this.palpite = palpite;
    }
}

