package com.example.jogododado.repositories;

import com.example.jogododado.models.Jogador;

import java.util.ArrayList;

public class JogadorRespositorio {

    private static JogadorRespositorio repository;
    private ArrayList<Jogador> jogadores = new ArrayList<>();

    public static JogadorRespositorio getInstance(){
        if(repository == null){
            repository = new JogadorRespositorio();
        }
        return repository;
    }

    private JogadorRespositorio(){}

    public void save(Jogador jogador){
        jogadores.add(jogador);
    }

    public void delete(Jogador jogador){
        jogadores.remove(jogador);
    }

    public ArrayList<Jogador> getAll(){
        return jogadores;
    }

    public void update(int index, Jogador jogador){
        jogadores.set(index, jogador);
    }

    public Jogador getByIndex(int index){
        return jogadores.get(index);
    }
}
