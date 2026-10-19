package com.example.examenlist;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView listView;
    // Datos simulados para el ListView del examen
    String[] titulos = {"a base", "a menu"};
    String[] subtitulos = {"vale 5", "otro de 5"};
    int[] iconos = {R.drawable.pizza, R.drawable.tacos}; // Sustituye con tus imágenes de res/drawable

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.vistotas); // Asegúrate que en tu activity_main.xml tu ListView tenga este ID
        listView.setOnItemClickListener(this);

        // Inicializar y asignar el adaptador
        Adaptador adaptador = new Adaptador(this, titulos, subtitulos, iconos);
        listView.setAdapter(adaptador);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        // Si da clic en el primer elemento, lleva a la actividad base/calculadora[cite: 1]
        if (position == 0) {
            Intent intent = new Intent(MainActivity.this, dos.class);
            startActivity(intent);
        }
        // Si da clic en el segundo elemento, lleva a la actividad del menú de puntitos[cite: 1]
        else if (position == 1) {
            Intent intent = new Intent(MainActivity.this, Menusote.class);
            startActivity(intent);
        }
    }
}