package com.example.chelesme.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
//import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.chelesme.R;

public class SplashScreenActivity extends AppCompatActivity {

    ImageView logo;
    TextView tvAppName;
    Animation leftoright,righttoleft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        logo        = findViewById(R.id.logo);
        tvAppName   = findViewById(R.id.tvAppName);

        leftoright  = AnimationUtils.loadAnimation(this,R.anim.lefttoright);
        righttoleft = AnimationUtils.loadAnimation(this,R.anim.righttoleft);

        logo.setAnimation(righttoleft);
        tvAppName.setAnimation(leftoright);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent a = new Intent(SplashScreenActivity.this, LanguageActivity.class);
                startActivity(a);
                finish();
            }
        },1500);
    }
}
