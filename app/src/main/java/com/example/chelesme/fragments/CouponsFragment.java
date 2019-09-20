package com.example.chelesme.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.Fragment;

import com.example.chelesme.R;

public class CouponsFragment extends Fragment {

    View view;
    LinearLayoutCompat
            linearLayoutOFF1,
            linearLayoutOFF2,
            linearLayoutOFF3;
    Animation fade;


    public CouponsFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.coupons_layout,container,false);

        linearLayoutOFF1 =view.findViewById(R.id.linearLayoutOFF1);
        linearLayoutOFF2 =view.findViewById(R.id.linearLayoutOFF2);
        linearLayoutOFF3 =view.findViewById(R.id.linearLayoutOFF3);

        fade = AnimationUtils.loadAnimation(view.getContext(),R.anim.fade);

        linearLayoutOFF1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linearLayoutOFF1.setBackgroundResource(R.drawable.bg_item_selected1);
                linearLayoutOFF2.setBackgroundResource(R.drawable.bg_item_disable);
                linearLayoutOFF3.setBackgroundResource(R.drawable.bg_item_disable);

            }
        });

        linearLayoutOFF2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linearLayoutOFF2.setBackgroundResource(R.drawable.bg_item_selected2);
                linearLayoutOFF1.setBackgroundResource(R.drawable.bg_item_disable);
                linearLayoutOFF3.setBackgroundResource(R.drawable.bg_item_disable);

            }
        });

        linearLayoutOFF3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linearLayoutOFF3.setBackgroundResource(R.drawable.bg_item_selected3);
                linearLayoutOFF2.setBackgroundResource(R.drawable.bg_item_disable);
                linearLayoutOFF1.setBackgroundResource(R.drawable.bg_item_disable);


            }
        });

        return view;
    }
}//The last class CouponsFragment
