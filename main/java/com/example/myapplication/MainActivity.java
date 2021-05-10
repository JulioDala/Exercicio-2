package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void registo (View view){
        EditText  nome1 =(EditText)findViewById(R.id.editTextTextPersonName);
        EditText  nome2 =(EditText)findViewById(R.id.editTextTextPersonName2);
        TextView mostrar =(TextView)findViewById(R.id.textView4);

        String nome =nome1.getText().toString();
        String sobreNome =nome2.getText().toString();
        if (nome.isEmpty() || sobreNome.isEmpty()   ) {
            mostrar.setText("Nome não Inserido");
        }
        else {
            String nomeCompleto = "Olá " + nome + " " + sobreNome;
            mostrar.setText(nomeCompleto);
        }

    }
}