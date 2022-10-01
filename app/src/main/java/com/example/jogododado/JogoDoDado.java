package com.example.jogododado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

import com.example.jogododado.models.Jogador;
import com.example.jogododado.repositories.JogadorRespositorio;

import java.util.Random;

public class JogoDoDado extends AppCompatActivity {

    private ImageView dado;
    private int[] numerosDoDado = {
            R.drawable.diceum,
            R.drawable.dicedois,
            R.drawable.dicetres,
            R.drawable.dicequatro,
            R.drawable.dicecinco,
            R.drawable.diceseis
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);

        dado = findViewById(R.id.dado);


        dado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Jogador jogador = new Jogador();
                int pontos = 0;
                int numerosAleatorios = new Random().nextInt(numerosDoDado.length);
                dado.setImageResource(numerosDoDado[numerosAleatorios]);
                if (numerosAleatorios == 0) {
                    pontos += 1;
                } else if (numerosAleatorios == 1) {
                    pontos += 2;
                } else if (numerosAleatorios == 2) {
                    pontos += 3;
                } else if (numerosAleatorios == 3) {
                    pontos += 4;
                } else if (numerosAleatorios == 4) {
                    pontos += 5;
                } else if (numerosAleatorios == 5) {
                    pontos += 6;
                }
                int finalPontos = pontos;
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        String nome = getIntent().getStringExtra("Name");
                        String genero = getIntent().getStringExtra("Genero");
                        String idade = getIntent().getStringExtra("Idade");

                        String pointString = String.valueOf(finalPontos);

                        jogador.setPontos(pointString);
                        jogador.setNome(nome);
                        jogador.setGenero(genero);
                        jogador.setPalpite(idade);

                        JogadorRespositorio.getInstance().save(jogador);
                        Intent intent = new Intent(JogoDoDado.this, ListaJogadores.class);
                        startActivity(intent);
                    }
                },2000);


            }
    });
}


}
