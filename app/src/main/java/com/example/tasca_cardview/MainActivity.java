package com.example.tasca_cardview;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void seguentButtonOnClick(View view) {
        EditText nomEditText = findViewById(R.id.nomEditText);
        String nom = nomEditText.getText().toString();

        //Saltem a l'Activity Felicitacions amb i li passem el nom
        Intent intent = new Intent(this, Felicitacions.class);
        intent.putExtra("nom", nom);
        startActivity(intent);
    }
}