package com.example.jose.practicaparcelable1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ActivityResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView texto = findViewById(R.id.texto);

        Intent intent = getIntent();
        Usuario usuario = intent.getParcelableExtra("usuario");

        texto.setText(usuario.toString());
    }
}
