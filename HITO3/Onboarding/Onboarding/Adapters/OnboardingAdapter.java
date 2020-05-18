package com.johanmarin.onboarding.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.johanmarin.onboarding.Onboarding.LoginFragment;
import com.johanmarin.onboarding.Onboarding.TextRecognitionFragment;
import com.johanmarin.onboarding.Onboarding.FaceDetectionFragment;
import com.johanmarin.onboarding.Onboarding.WelcomeFragment;

public class OnboardingAdapter extends FragmentPagerAdapter
{
    public OnboardingAdapter(FragmentManager fm)
    {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position)
    {
        switch (position)
        {
            case 0:
                return new WelcomeFragment();
            case 1:
                return new TextRecognitionFragment();
            case 2:
                return new FaceDetectionFragment();
            case 3:
                return new LoginFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount()
    {
        return 4;
    }
}
