package com.felipe.reciclapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class metodos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metodos);
    }
    public void menu(View view){
        Intent menu = new Intent(this,MainMenu.class);
        startActivity(menu);
    }
}