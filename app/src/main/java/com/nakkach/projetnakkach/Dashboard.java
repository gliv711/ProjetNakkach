package com.nakkach.projetnakkach;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.temporal.Temporal;
import java.util.Calendar;
import java.util.Date;

public class Dashboard extends AppCompatActivity {

    String Current_date ;

    String menstrual_cycle_date_input ;
    TextView days ;
    TextView days_letters ;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    Long daysBetween ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        days = findViewById(R.id.days);
        days_letters = findViewById(R.id.days_letters);
        Current_date = "12/11/2022" ;


        Calendar cal = Calendar.getInstance();

        try {
            cal.setTime(sdf.parse(Current_date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Date Current_date_in_format = cal.getTime();


        // use add() method to add the days to the given date
        cal.add(Calendar.DAY_OF_MONTH, 21);
        Date Next_date = cal.getTime();

       Log.e("n", String.valueOf(Next_date));



        if (Integer.valueOf(days.getText().toString())<2){
            days_letters.setText("jour");
        }
        else {
            days_letters.setText("Jours");
        }








    }
}