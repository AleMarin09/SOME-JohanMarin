package com.e.onboardingvirtual.Onboarding;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.e.onboardingvirtual.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TextRecognitionFragment extends Fragment {
    private TextView textNextAwards, textPrevAwards;
    private ViewPager viewPager;
    private View view;

    public TextView getTextNextAwards() {
        return textNextAwards;
    } {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //initialize viewpager from main activity
        _initializeInflater(inflater, container);

        //initialize components
        _initialize();

        //add click event to text Next and prev text
        _addClickNextAndPrev();

        //return
        return view;
    }

    public void _initializeInflater(LayoutInflater inflater, ViewGroup container) {
        view = inflater.inflate(R.layout.fragment_text_recognition, container, false);
    }

    public void _initialize() {
        viewPager = getActivity().findViewById(R.id.textNextAwards);
        textNextAwards = view.findViewById(R.id.textNextAwards);
        textPrevAwards = view.findViewById(R.id.textPrevAwards);
    }

    public void _addClickNextAndPrev() {
        textNextAwards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(2);
            }
        });

        textPrevAwards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(0);
            }
        });
    }
}
