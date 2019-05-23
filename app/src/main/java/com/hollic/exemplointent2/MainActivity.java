package com.hollic.exemplointent2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText campo;
    Button botao;

    public static final String ARG_TEXTO = "ARG_TEXTO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campo = findViewById(R.id.campo);
        botao = findViewById(R.id.botao);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texto = campo.getText().toString();
                Intent i = new Intent(MainActivity.this,Main2Activity.class);
                i.putExtra(ARG_TEXTO,texto);
                startActivity(i);
            }
        });


    }
}
