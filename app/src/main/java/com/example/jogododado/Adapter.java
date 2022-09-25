package com.example.jogododado;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jogododado.models.Jogador;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private ArrayList<Jogador> jogadores;

    public Adapter(ArrayList<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

        @NonNull
        @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_lista_jogadores,parent, false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

//        holder.titulo.setText
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView nome;
        TextView genero;
        TextView idade;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            nome = itemView.findViewById(R.id.nome);
            genero = itemView.findViewById(R.id.genero);
            idade = itemView.findViewById(R.id.idade);

            nome.setText(Jogador.getNome());
            genero.setText(Jogador.getGenero());
            idade.setText(Jogador.getIdade());
        }
    }
}
