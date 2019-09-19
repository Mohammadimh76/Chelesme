package com.example.chelesme;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

   Button btn_profile,
            btn_education,
            btn_health,
            btn_goal,
            btn_comfort,
           btn_finance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_profile = findViewById(R.id.buttonProfile);
        btn_education = findViewById(R.id.buttonEducation);
        btn_health = findViewById(R.id.buttonHealth);
        btn_goal = findViewById(R.id.buttoneGoal);
        btn_comfort = findViewById(R.id.buttonComfort);
        btn_finance = findViewById(R.id.buttonFinance);

        btn_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Profile Click", Toast.LENGTH_SHORT).show();
            }
        });

        btn_education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Education Click", Toast.LENGTH_SHORT).show();
            }
        });

        btn_health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Health Click", Toast.LENGTH_SHORT).show();
            }
        });

        btn_goal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Goal Click", Toast.LENGTH_SHORT).show();
            }
        });

        btn_comfort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Comfort Click", Toast.LENGTH_SHORT).show();
            }
        });

        btn_finance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Finance Click", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
