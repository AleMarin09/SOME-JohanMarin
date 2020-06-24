package com.e.pruebalibre;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.e.mylibreryjohanmarinmontoya.adapters.OnboardingAdapter;
import com.e.mylibreryjohanmarinmontoya.onboarding.FaceDetectionFragment;
import com.e.mylibreryjohanmarinmontoya.onboarding.LoginFragment;
import com.e.mylibreryjohanmarinmontoya.onboarding.TextRecognitionFragment;
import com.e.mylibreryjohanmarinmontoya.onboarding.WelcomeFragment;


public class MainActivity extends AppCompatActivity {

    private ViewPager viewPagerContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initializeComponents
        _initializeComponents();

        //initializeAdapter
        _initializeFragmentAdapter();
    }

    public void _initializeComponents(){
        viewPagerContainer = findViewById(R.id.viewPagerContainer);
    }

    public void _initializeFragmentAdapter() {
        OnboardingAdapter adapter = new OnboardingAdapter(getSupportFragmentManager());
        viewPagerContainer.setAdapter(adapter);
    }

}