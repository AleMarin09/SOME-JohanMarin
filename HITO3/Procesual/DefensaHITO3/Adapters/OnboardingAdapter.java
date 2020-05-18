package com.e.hito3_johanalejandromarinmontoya.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.e.hito3_johanalejandromarinmontoya.Onboarding.FragmentInicio1;
import com.e.hito3_johanalejandromarinmontoya.Onboarding.FragmentLogin;
import com.e.hito3_johanalejandromarinmontoya.Onboarding.FragmentSegundo;

public class OnboardingAdapter  extends FragmentPagerAdapter {
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
                return new FragmentInicio1();
            case 1:
                return new FragmentSegundo();
            case 2:
                return new FragmentLogin();

            default:
                return null;
        }
    }

    @Override
    public int getCount()
    {
        return 3;
    }

}
