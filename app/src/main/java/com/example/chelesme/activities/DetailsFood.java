package com.example.chelesme.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.chelesme.R;
import com.example.chelesme.adapters.ViewPagerAdapter;
import com.example.chelesme.fragments.CommentsFragment;
import com.example.chelesme.fragments.CouponsFragment;
import com.example.chelesme.fragments.MenuFragment;
import com.google.android.material.tabs.TabLayout;

public class DetailsFood extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_food);

        toolbar = findViewById(R.id.toolbar_id);
        setSupportActionBar(toolbar);

        viewPager = findViewById(R.id.viewpager_id);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFragment(new MenuFragment(),"Menu");
        adapter.addFragment(new CommentsFragment(),"Comments");
        adapter.addFragment(new CouponsFragment(),"Coupons");


        viewPager.setAdapter(adapter);

        tabLayout = findViewById(R.id.tablayout_id);

        tabLayout.setupWithViewPager(viewPager);



    }
}
