package com.example.jogododado;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.os.Handler;
        import android.view.View;
        import android.widget.Button;

        import com.example.jogododado.models.Jogador;
        import com.example.jogododado.repositories.JogadorRespositorio;
        import com.google.android.material.textfield.TextInputEditText;
        import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout inputLayoutNome;
    private TextInputLayout inputLayoutGenero;
    private TextInputLayout inputLayoutIdade;

    private TextInputEditText inputEditTextName;
    private TextInputEditText inputEditTextGenero;
    private TextInputEditText inputEditTextIdade;

    private Button buttonAddJogador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_jogadores);

        inputLayoutNome = findViewById(R.id.input_layout_nome);
        inputLayoutGenero = findViewById(R.id.input_layout_genero);
        inputLayoutIdade = findViewById(R.id.input_layout_idade);

        inputEditTextName = findViewById(R.id.input_text_nome);
        inputEditTextGenero = findViewById(R.id.input_text_genero);
        inputEditTextIdade = findViewById(R.id.input_text_idade);

        buttonAddJogador =(Button)findViewById(R.id.button_add_jogador);
                        buttonAddJogador.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                                String nome = inputEditTextName.getText().toString();
                                String genero = inputEditTextGenero.getText().toString();
                                String idade = inputEditTextIdade.getText().toString();
                                String pontos = "";

                                Jogador jogador = new Jogador(nome, genero, idade, pontos);
                                //JogadorRespositorio.getInstance().save(jogador);

                                Intent intent = new Intent(MainActivity.this, JogoDoDado.class);
                                intent.putExtra("Name", nome);
                                intent.putExtra("Genero", genero);
                                intent.putExtra("Idade", idade);
                                startActivity(intent);
                            }
                        });
    }
}