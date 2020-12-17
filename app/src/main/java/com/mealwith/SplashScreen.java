package com.mealwith;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.WindowManager;

public class SplashScreen extends AppCompatActivity {
    //Variables
        private final static int SPLASH_SCREEN_DURATION = 4000; // Durée d'apparition du splashscreen en ms

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        // Enlevons la barre en haut
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);



        // Création d'un Handler pour navigation vers la MainActivity suite à l'écoulement de la durée programmée de l'animation
        new Handler(Looper.myLooper()).postDelayed(() -> {
            Intent intent = new Intent(SplashScreen.this,MainActivity.class);
            startActivity(intent);
            finish();
        },SPLASH_SCREEN_DURATION);
    }
}