package com.example.jogododado;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jogododado.models.Jogador;

import java.util.ArrayList;

public class JogadorAdapter extends RecyclerView.Adapter<JogadorAdapter.JogadorViewHolder> {

    private ArrayList<Jogador> jogadores;

    public JogadorAdapter(ArrayList<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    @NonNull
    @Override
    public JogadorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_lista_jogadores,parent, false);

        return new JogadorViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull JogadorViewHolder holder, int position) {
        Jogador jogador = jogadores.get(position);

        TextView textViewNome =
                holder.itemView.findViewById(R.id.nome);
        TextView textViewGenero =
                holder.itemView.findViewById(R.id.genero);
        TextView textViewIdade =
                holder.itemView.findViewById(R.id.idade);

        textViewNome.setText(jogador.getNome());
        textViewGenero.setText(jogador.getGenero());
        textViewIdade.setText(jogador.getIdade());
    }

    @Override
    public int getItemCount() {
        return jogadores.size();
    }

    public class JogadorViewHolder extends RecyclerView.ViewHolder{

        public JogadorViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
