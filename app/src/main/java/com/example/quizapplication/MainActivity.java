package com.example.quizapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
      Button start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start = findViewById(R.id.startBtn);
        start.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,QuestionStartActivity.class);
            startActivity(intent);
        });
    }
}
