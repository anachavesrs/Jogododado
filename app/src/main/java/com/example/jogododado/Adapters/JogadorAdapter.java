package com.example.jogododado.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jogododado.R;
import com.example.jogododado.models.Jogador;

import java.util.ArrayList;

public class JogadorAdapter extends RecyclerView.Adapter<JogadorAdapter.JogadorViewHolder> {

    private ArrayList<Jogador> jogadores;

    public JogadorAdapter(ArrayList<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public static class JogadorViewHolder extends RecyclerView.ViewHolder {
        public JogadorViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    @NonNull
    @Override
    public JogadorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_lista_jogadores, parent, false);

        return new JogadorViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull JogadorViewHolder holder, int position) {
        Jogador jogador = jogadores.get(position);

        TextView textViewNome =
                holder.itemView.findViewById(R.id.text_name);
        TextView textViewGenero =
                holder.itemView.findViewById(R.id.text_gender);
        TextView textViewIdade =
                holder.itemView.findViewById(R.id.text_age);
        TextView textViewPontos =
                holder.itemView.findViewById(R.id.text_points);

        textViewNome.setText(jogador.getNome());
        textViewGenero.setText(jogador.getGenero());
        textViewIdade.setText(jogador.getIdade());
        textViewPontos.setText(jogador.getPontos());
    }

    @Override
    public int getItemCount() {
        return jogadores.size();
    }

}
