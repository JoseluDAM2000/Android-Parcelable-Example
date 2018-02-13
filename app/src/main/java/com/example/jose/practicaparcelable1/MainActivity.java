package com.example.jose.practicaparcelable1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button boton;
    private EditText usuario;
    private EditText contra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton = findViewById(R.id.button);
        usuario = findViewById(R.id.textoNombre);
        contra = findViewById(R.id.textoContrasena);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Usuario user = new Usuario(usuario.getText().toString(), contra.getText().toString());

                Intent intent = new Intent(MainActivity.this, ActivityResult.class);

                intent.putExtra("usuario", user);

                startActivity(intent);
           }
        });
    }
}
