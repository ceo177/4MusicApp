package com.example.android.a4musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //start intent POP
        Button btnPop = findViewById(R.id.btn_pop);

        btnPop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popIntent = new Intent(MainActivity.this, pop.class);
                startActivity(popIntent);
            }
        });

        //start intent hip hop
        Button btnHipHop = findViewById(R.id.btn_hiphop);

        btnHipHop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hipHopIntent = new Intent(MainActivity.this, HipHop.class);
                startActivity(hipHopIntent);
            }
        });
        //start activity Dance
        Button btnDance = findViewById(R.id.btn_dance);

        btnDance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent danceIntent = new Intent(MainActivity.this, Dance.class);
                startActivity(danceIntent);
            }
        });

    }
}
























