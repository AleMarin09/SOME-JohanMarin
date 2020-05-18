package com.e.hito3_johanalejandromarinmontoya.Onboarding;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.e.hito3_johanalejandromarinmontoya.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentSegundo extends Fragment {

    private TextView textPrevFace, textNextFace;
    private Button btnskip;
    private ViewPager viewPager;
    private View view;

    public FragmentSegundo()
    {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        //initialize viewpager from main activity
        initializeInflater(inflater, container);

        //initialize components
        initializeComponents();

        //add click event to text Next and prev text
        addClickNextAndPrev();

        //return
        return view;
    }

    public void initializeInflater(LayoutInflater inflater, ViewGroup container)
    {
        view = inflater.inflate(R.layout.fragment_segundo, container, false);
    }

    public void initializeComponents()
    {
        viewPager = getActivity().findViewById(R.id.viewPagerContainer);
        btnskip = view.findViewById(R.id.btnSkip);
        textNextFace = view.findViewById(R.id.textnetxt);
    }

    public void addClickNextAndPrev()
    {

        btnskip.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                viewPager.setCurrentItem(3);
            }
        });

        textNextFace.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                viewPager.setCurrentItem(3);
            }
        });
    }
}

