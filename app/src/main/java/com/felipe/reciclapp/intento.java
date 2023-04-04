package com.felipe.reciclapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class intento extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intento);
    }
    //metodos
    //Crear un intento
    public void Siguiente(View view){
        Intent siguiente =new Intent(this,intento2.class);
        startActivity(siguiente);
    }
}