package com.example.jogododado.models;

public class Jogador {
    private String nome;
    private String genero;
    private String idade;
    private String pontos;

    public Jogador(String nome, String genero, String idade, String pontos) {
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
        this.pontos = pontos;
    }

    public Jogador() {}

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public String getIdade() {
        return idade;
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

    public void setIdade(String idade) {
        this.idade = idade;
    }
}

