package com.example.onboarding.onboarding;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;



import com.example.onboarding.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment  {

    private TextView textPrev;
    private ViewPager viewPager;
    private View view ;
    private Button btLogin;
    private Button btregister;
    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        _initializeInflater(inflater, container);
        _initialize();

        //add click event to text Next and prev text
        _addClickNextAndPrev();

        //return
        return view;
    }
    private void _initializeInflater(LayoutInflater inflater, ViewGroup container) {
       // view = inflater.inflate(R.layout.fragment_logi, container, false);
    }

    public void _initialize() {
        viewPager = getActivity().findViewById(R.id.viewPagerContainer);

        btLogin = view.findViewById(R.id.btLogin);
        btregister = view.findViewById(R.id.btRegister);
    }

    public void _addClickNextAndPrev() {
        textPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(5);
            }
        });

        textPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(4);
            }
        });
    }

}
