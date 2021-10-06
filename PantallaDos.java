package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class PantallaDos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_dos);

        Intent intent = getIntent();
        String usuario = intent.getStringExtra(MainActivity.USUARIO_APLICACION);

        TextView bienvenida = findViewById(R.id.TextViewBienvenida);
        bienvenida.setText("Bienvenido Mr. " + usuario);

    }
}