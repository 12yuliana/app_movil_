package com.felipe.reciclapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }
    public void Siguiente(View view){
        Intent siguiente = new Intent(this,MainActivity.class);
        startActivity(siguiente);
    }
    public void tipos(View view){
        Intent tipos = new Intent(this,tipos.class);
        startActivity(tipos);
    }
    public void recicla(View view){
        Intent recicla = new Intent(this,reciclaya.class);
        startActivity(recicla);
    }
    public void metodos(View view){
        Intent metodos = new Intent(this,metodos.class);
        startActivity(metodos);
    }
}