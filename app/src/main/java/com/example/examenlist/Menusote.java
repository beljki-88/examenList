package com.example.examenlist;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class Menusote extends AppCompatActivity {

    Button btnRegreso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menudos);

        // 1. Vinculamos el botón de regreso del XML
        btnRegreso = findViewById(R.id.btn_regreso);

        // 2. Programamos el evento clic para volver a la pantalla principal[cite: 2]
        btnRegreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menusote.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    // 3. Inflamos el menú de los 3 puntitos
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menusote, menu);
        return true;
    }

    // 4. Aquí programamos la acción al seleccionar cada saludo del menú
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Mensajitos objMensajes = new Mensajitos(); // Instanciamos tu clase auxiliar
        int id = item.getItemId();

        if (id == R.id.opcion_saludo) {
            // Muestra el saludo 1 en un Toast
            Toast.makeText(this, objMensajes.getSaludo1(), Toast.LENGTH_LONG).show();
            return true;
        }
        else if (id == R.id.opcion_otro_saludo) {
            // Muestra el saludo 2 en un Toast
            Toast.makeText(this, objMensajes.getSaludo2(), Toast.LENGTH_LONG).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}