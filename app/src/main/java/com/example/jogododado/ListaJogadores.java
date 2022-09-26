package com.example.jogododado;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.jogododado.Adapters.JogadorAdapter;
import com.example.jogododado.models.Jogador;
import com.example.jogododado.repositories.JogadorRespositorio;

import java.util.ArrayList;


public class ListaJogadores extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_jogadores);

        recyclerView = findViewById(R.id.recyclerView);
        //Configuração do Adapter

        recyclerView.setLayoutManager(
                new LinearLayoutManager(this,
                        RecyclerView.VERTICAL,
                        false
                )
        );
    }
    //Configuração do Adapter
        @Override
        protected void onResume() {
            super.onResume();

            ArrayList<Jogador> jogadores = JogadorRespositorio
                    .getInstance().getAll();

            if(jogadores.size() > 0){

            }

        recyclerView.setAdapter(new JogadorAdapter(jogadores));

    }
}