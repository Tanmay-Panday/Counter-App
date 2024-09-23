package com.example.counterapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView welcomeText, coutnerText;
    Button my_btn;
    int[] counter = {0}; //using array for call by reference


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        my_btn = findViewById(R.id.btn);
        coutnerText = findViewById(R.id.counter_text);
        welcomeText = findViewById(R.id.welcome_text);
        // functionalities

        my_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increaseCounter();
                coutnerText.setText(""+counter[0]);
            }
        });
    }

    private void increaseCounter(){
        ++counter[0];
    }
}