package com.nakkach.projetnakkach;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


import com.google.android.material.textfield.TextInputEditText;



public class WelcomePage extends AppCompatActivity {
    TextInputEditText first_name;
    TextInputEditText last_name;
    TextInputEditText date;
    Button button1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);
        first_name = findViewById(R.id.first_name);
        last_name = findViewById(R.id.last_name);
        date = findViewById(R.id.date);
        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextScreen = new Intent(getApplicationContext(), Dashboard.class);

                nextScreen.putExtra("first_name", first_name.getText().toString());
                nextScreen.putExtra("last_name", last_name.getText().toString());
                Log.e("n", "User logged with Username = " + first_name.getText().toString() + " and last name = " + last_name.getText().toString());
                startActivity(nextScreen);
            }


        });
    }
}
