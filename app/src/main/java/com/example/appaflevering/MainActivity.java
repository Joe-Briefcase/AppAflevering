package com.example.appaflevering;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textWelcome;
    TextView textChoice;
    Button buttonVejledning;
    Button buttonIndstillinger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textWelcome = findViewById(R.id.textWelcome);
        textChoice = findViewById(R.id.textChoice);
        buttonVejledning = findViewById(R.id.buttonVejledning);
        buttonIndstillinger = findViewById(R.id.buttonIndstillinger);

        buttonVejledning.setOnClickListener(this);
        buttonIndstillinger.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == buttonVejledning){
            textChoice.setText("Du har valgt: Vejledning");
        }

        if (view == buttonIndstillinger){
            textChoice.setText("Du har valgt: Indstillinger");
        }
    }
}
