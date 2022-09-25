package com.example.jogododado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

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

        dado = findViewById(R.id.dado);

        dado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int numerosAleatorios = new Random().nextInt(numerosDoDado.length);
                dado.setImageResource(numerosDoDado[numerosAleatorios]);

            }
        });
    }
}