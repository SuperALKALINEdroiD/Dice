package com.example.diceapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.concurrent.ThreadLocalRandom;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tapButton(View view) {
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);
        int randomInt = ThreadLocalRandom.current().nextInt(1, 7);

        textView.setText(String.valueOf(randomInt));


    }
}
