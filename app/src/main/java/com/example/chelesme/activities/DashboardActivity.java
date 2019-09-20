package com.example.chelesme.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.*;

import com.example.chelesme.R;

public class DashboardActivity extends AppCompatActivity {

    Button buttonStay,
            buttonPaymentServices,
            buttonTransportation,
            buttoneHealthCenters,
            buttonAroundMe,
            buttonOrderFood;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


        buttonStay = findViewById(R.id.buttonStay);
        buttonPaymentServices = findViewById(R.id.buttonPaymentServices);
        buttonTransportation = findViewById(R.id.buttonTransportation);
        buttoneHealthCenters = findViewById(R.id.buttoneHealthCenters);
        buttonAroundMe = findViewById(R.id.buttonAroundMe);
        buttonOrderFood = findViewById(R.id.buttonOrderFood);


        buttonStay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DashboardActivity.this, "buttonStay Click", Toast.LENGTH_SHORT).show();
            }
        });

        buttonPaymentServices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DashboardActivity.this, "Education Click", Toast.LENGTH_SHORT).show();
            }
        });

        buttonTransportation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DashboardActivity.this, "Health Click", Toast.LENGTH_SHORT).show();
            }
        });

        buttoneHealthCenters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DashboardActivity.this, "Goal Click", Toast.LENGTH_SHORT).show();
            }
        });

        buttonAroundMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DashboardActivity.this, "Comfort Click", Toast.LENGTH_SHORT).show();
            }
        });

        buttonOrderFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(DashboardActivity.this, "Finance Click", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(DashboardActivity.this, DetailsFood.class));
                finish();
            }
        });




    }//The last method onCreate
}//The last class
