package com.example.tasca_cardview;

import android.util.Log;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Felicitacions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_felicitacions);

        //Capturem el nom
        String nom = getIntent().getStringExtra("nom");

        //Ho mostrem per pantalla
        TextView textView = findViewById(R.id.text);
        textView.setText(String.format("Bon nadal %s!", nom));
    }
}