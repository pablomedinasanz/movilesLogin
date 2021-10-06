package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String USUARIO_APLICACION = "usuario";
    Context contextoActividad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contextoActividad = this;

        Button btLogin = (Button) this.findViewById(R.id.button);

        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                comprobarLogin();
            }
        });
    }

    private void comprobarLogin() {

        EditText txtUsuario = (EditText) this.findViewById(R.id.usuario);
        EditText txtPassword = (EditText) this.findViewById(R.id.password);

        String dataUsuario = txtUsuario.getText().toString();
        String dataPassword = txtPassword.getText().toString();

        if (dataUsuario.equals("") && dataPassword.equals("")) {

            Toast.makeText(contextoActividad, "No puede estar vacío", Toast.LENGTH_LONG).show();

        } else if (!dataUsuario.equals("") && !dataPassword.equals("")) {

            String usuarioBueno = "root";
            String claveBuena = "toor";

            if (dataUsuario.equals(usuarioBueno) && dataPassword.equals(claveBuena)) {
                // ira el intent
                Intent intent = new Intent(this, PantallaDos.class);
                intent.putExtra(USUARIO_APLICACION, dataUsuario); //pasamos el nombre de usuario
                startActivity(intent);

            } else {
                Toast.makeText(contextoActividad, "Usuario o contraseña incorrecta", Toast.LENGTH_LONG).show();
            }
        } else {
            Toast.makeText(contextoActividad, "Qué ha pachao!!", Toast.LENGTH_LONG).show();
        }
    }
}