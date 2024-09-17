package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1); // Set the layout file

        // Find the button by its ID
        Button btn1 = findViewById(R.id.btn1);

        // Set click listener to handle button press
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to start Activity2
                Intent intent = new Intent(Activity1.this, Activity2.class);

                // Pass the parameter "Сергеев" to Activity2
                intent.putExtra("param", "Сергеев");

                // Start Activity2
                startActivity(intent);
            }
        });
    }
}
