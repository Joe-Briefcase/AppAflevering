package com.example.appaflevering;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textWelcome;
    TextView textChoice;
    TextView textURL;
    Button buttonVejledning;
    Button buttonIndstillinger;
    Button buttonOK;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Text views.
        textWelcome = findViewById(R.id.textWelcome);
        textChoice = findViewById(R.id.textChoice);
        textURL = findViewById(R.id.testURL);

        //Button views.
        buttonVejledning = findViewById(R.id.buttonVejledning);
        buttonIndstillinger = findViewById(R.id.buttonIndstillinger);
        buttonOK = findViewById(R.id.buttonOK);

        //Webview.
        webView = findViewById(R.id.webView);
        webView = new WebView(this);

        //Set listeners.
        buttonVejledning.setOnClickListener(this);
        buttonIndstillinger.setOnClickListener(this);
        buttonOK.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        //Button Vejledning.
        if (view == buttonVejledning){
            textChoice.setText("Du har valgt: Vejledning");
        }

        //Button Indstillinger.
        if (view == buttonIndstillinger){
            textChoice.setText("Du har valgt: Indstillinger");
        }

        //Button OK til WebView.
        if (view == buttonOK){
            webView.loadUrl("https://www." + textURL.getText().toString());
            setContentView(webView);
        }
    }
}
