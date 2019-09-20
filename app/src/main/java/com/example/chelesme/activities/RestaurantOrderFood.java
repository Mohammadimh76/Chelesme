package com.example.chelesme.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.chelesme.R;
import com.example.chelesme.adapters.ViewPagerAdapterSixFr;
import com.example.chelesme.fragments.FiveFragment;
import com.example.chelesme.fragments.FourFragment;
import com.example.chelesme.fragments.OneFragment;
import com.example.chelesme.fragments.SixFragment;
import com.example.chelesme.fragments.ThreeFragment;
import com.example.chelesme.fragments.TwoFragment;
import com.google.android.material.tabs.TabLayout;

public class RestaurantOrderFood extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_order_food);

        toolbar = findViewById(R.id.toolbar_id);
        setSupportActionBar(toolbar);

        viewPager = findViewById(R.id.viewpager_id);

        ViewPagerAdapterSixFr adapter = new ViewPagerAdapterSixFr(getSupportFragmentManager());


        adapter.addFragment(new OneFragment(),"Highest rank");
        adapter.addFragment(new TwoFragment(),"The closest");
        adapter.addFragment(new ThreeFragment(),"Cheapest");
        adapter.addFragment(new FourFragment(),"Overall performance");
        adapter.addFragment(new FiveFragment(),"The best coupons");
        adapter.addFragment(new SixFragment(),"The most expensive");

        viewPager.setAdapter(adapter);

        tabLayout = findViewById(R.id.tablayout_id);

        tabLayout.setupWithViewPager(viewPager);

    }
}
