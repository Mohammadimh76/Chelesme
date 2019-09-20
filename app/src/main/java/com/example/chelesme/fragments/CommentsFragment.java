package com.example.chelesme.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.chelesme.R;

public class CommentsFragment extends Fragment {

    View view;
    ProgressBar LinearProgressBar_happy_face,
            LinearProgressBar_indifferent_face,
            LinearProgressBar_angry_face;

    public CommentsFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.comments_layout,container,false);
        LinearProgressBar_happy_face = view.findViewById(R.id.LinearProgressBar_happy_face);
        LinearProgressBar_indifferent_face = view.findViewById(R.id.LinearProgressBar_indifferent_face);
        LinearProgressBar_angry_face = view.findViewById(R.id.LinearProgressBar_angry_face);

        LinearProgressBar_happy_face.setVisibility(View.VISIBLE);
        LinearProgressBar_happy_face.setProgress(45);
        LinearProgressBar_happy_face.setMax(100);

        LinearProgressBar_indifferent_face.setVisibility(View.VISIBLE);
        LinearProgressBar_indifferent_face.setProgress(35);
        LinearProgressBar_indifferent_face.setMax(100);

        LinearProgressBar_angry_face.setVisibility(View.VISIBLE);
        LinearProgressBar_angry_face.setProgress(20);
        LinearProgressBar_angry_face.setMax(100);

        return view;
    }
}//The last class CommentsFragment
