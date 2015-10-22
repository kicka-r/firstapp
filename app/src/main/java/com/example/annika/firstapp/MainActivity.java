package com.example.annika.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<String> advices = new ArrayList<>();
        advices.add("va int dum!");
        advices.add("lev livet!");
        advices.add("lev som du lär");

        final Random r = new Random();

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, advices.get(r.nextInt(advices.size()-1)), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
