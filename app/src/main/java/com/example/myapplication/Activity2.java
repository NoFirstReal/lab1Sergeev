package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2); // Set the layout file

        // Get the passed parameter from the Intent
        String receivedParam = getIntent().getStringExtra("param");

        // Find the TextView and set the text with the passed parameter
        TextView textView = findViewById(R.id.textView);
        textView.setText("Переданный параметр: " + receivedParam);
    }
}
