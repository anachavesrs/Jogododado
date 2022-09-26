package com.example.jogododado.models;

public class Jogador {
    private String nome;
    private String genero;
    private String idade;

    public Jogador(String nome, String genero, String idade) {
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public String getIdade() {
        return idade;
    }
}

