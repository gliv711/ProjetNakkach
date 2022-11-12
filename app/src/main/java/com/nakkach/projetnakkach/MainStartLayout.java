package com.nakkach.projetnakkach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.ProgressBar;

public class MainStartLayout extends AppCompatActivity {
    private ProgressBar progressBar1 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_start_layout);
        progressBar1 = findViewById(R.id.progressBar1);
        Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent nextScreen = new Intent(getApplicationContext(), WelcomePage.class);
                startActivity(nextScreen);
            }
        }, 3000);

    }
}