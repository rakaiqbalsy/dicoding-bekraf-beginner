package com.dicoding.rakaiqbalsy.smasmknegeridipurwakarta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.dicoding.rakaiqbalsy.smasmknegeridipurwakarta.SMA.Activity.SMA_MAIN;
import com.dicoding.rakaiqbalsy.smasmknegeridipurwakarta.SMK.Activity.SMKActivity;

public class MainActivity extends AppCompatActivity {

    private CardView cvSma, cvSmk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cvSma = findViewById(R.id.cvSMA);

        cvSmk =findViewById(R.id.cvSMK);

        cvSma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, SMA_MAIN.class);
                startActivity(i);
            }
        });

        cvSmk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, SMKActivity.class);
                startActivity(i);
            }
        });
    }
}
