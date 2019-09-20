package com.example.chelesme.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.chelesme.R;

public class LanguageActivity extends AppCompatActivity {

    CardView cardView_English,cardViewPersion,
            cardViewArabic,cardViewGermany,
            cardViewFrench,cardViewChinese;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lan);

        cardView_English = findViewById(R.id.cardView_English);
        cardViewPersion = findViewById(R.id.cardViewPersion);
        cardViewArabic = findViewById(R.id.cardViewArabic);
        cardViewGermany = findViewById(R.id.cardViewGermany);
        cardViewFrench = findViewById(R.id.cardViewFrench);
        cardViewChinese = findViewById(R.id.cardViewChinese);


        cardView_English.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LanguageActivity.this, DashboardActivity.class));
                finish();
            }
        });

        cardViewPersion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LanguageActivity.this, DashboardActivity.class));
                finish();
            }
        });

        cardViewArabic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LanguageActivity.this, DashboardActivity.class));
                finish();
            }
        });

        cardViewGermany.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LanguageActivity.this, DashboardActivity.class));
                finish();
            }
        });

        cardViewFrench.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LanguageActivity.this, DashboardActivity.class));
                finish();
            }
        });

        cardViewChinese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LanguageActivity.this, DashboardActivity.class));
                finish();
            }
        });




    }//the last method onCreate
}//the last class
