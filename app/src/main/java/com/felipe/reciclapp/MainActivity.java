package com.felipe.reciclapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
//
    Button boton_1;
    VideoView videoview1;





    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton_1 = findViewById(R.id.boton_1);
        videoview1 = findViewById(R.id.videoview1);
        videoview1.setVideoPath("android.resource://"+getPackageName()+"/" + R.raw.botella);
        videoview1.setMediaController(new MediaController(this ));
        videoview1.start();
    }
    public void Siguiente(View view){
        Intent siguiente = new Intent(this,MainMenu.class);
        startActivity(siguiente);
    }


}