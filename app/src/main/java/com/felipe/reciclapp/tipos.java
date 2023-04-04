package com.felipe.reciclapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;

public class tipos extends AppCompatActivity {

    Button btnegro, btnverde, btnblanco; // DECLARAR
    MediaPlayer sonidonegro, sonidoverde, sonidoblanco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipos);

        // REFERENCIAR

        btnegro = findViewById(R.id.btnsonido_negro);
        btnverde =findViewById(R.id.btnsonido_verde);
        btnblanco= findViewById(R.id.btnsonido_blanco);// referenciar

        // creacion de sonidos
        sonidonegro = MediaPlayer.create(this, R.raw.rojo);

        sonidoverde = MediaPlayer.create(this, R.raw.verde);

        sonidoblanco = MediaPlayer.create(this, R.raw.rojo);

        btnegro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonidonegro.start();
            }
        });


        btnblanco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonidoblanco.start();

            }
        });
        btnverde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                sonidoverde.start();

            }
        });



    }
    public void menu(View view){
        Intent menu = new Intent(this,MainMenu.class);
        startActivity(menu);
    }
}