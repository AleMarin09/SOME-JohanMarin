package com.e.hito3_johanalejandromarinmontoya.Onboarding;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.e.hito3_johanalejandromarinmontoya.Calculadoras.CalculadoraCientifica;
import com.e.hito3_johanalejandromarinmontoya.Calculadoras.CalculadoraCostum;
import com.e.hito3_johanalejandromarinmontoya.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentLogin extends Fragment {

    public EditText etusername,selectup;
    public Button btndesc1, btnSelect1,btndesc2,btnSelect2,btndesc3,btnSelect3,btniniciar;
    private View view;

    public FragmentLogin() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        initializeInflater(inflater, container);
        iniciar();
        setMensaje();

        return view;
    }
    public void initializeInflater(LayoutInflater inflater, ViewGroup container)
    {
        view = inflater.inflate(R.layout.fragment_login, container, false);
    }
    public void iniciar()
    {

        btndesc1 = view.findViewById(R.id.btndesc1);
        btnSelect1 = view.findViewById(R.id.btnSelect1);
        btndesc2 = view.findViewById(R.id.btndesc2);
        btnSelect2 = view.findViewById(R.id.btnSelect2);
        btndesc3 = view.findViewById(R.id.btndesc3);
        btnSelect3 = view.findViewById(R.id.btnSelect3);
        etusername = view.findViewById(R.id.etusername);
        selectup = view.findViewById(R.id.selectup);
        btniniciar = view.findViewById(R.id.btniniciar);
    }
    public void setMensaje() {

        btndesc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Calculadora con operaciones simples basica", Toast.LENGTH_SHORT).show();
            }
        });
        btnSelect1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                selectup.setText("Basico");
            }
        });
        btndesc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Calculadora con operaciones avanzadas", Toast.LENGTH_SHORT).show();
            }
        });
        btnSelect2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                selectup.setText("Cientifico");
            }
        });
        btndesc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Calculadora con operaciones para programadores", Toast.LENGTH_SHORT).show();
            }
        });
        btnSelect3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                selectup.setText("Costum");
            }
        });

        btniniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String username = etusername.getText().toString().trim();
                String selectup1 = selectup.getText().toString().trim();
                if (selectup1.equals("Select Up")|| username.equals("Username") )
                {
                    Toast.makeText(getActivity(),"Por favor selecione los campos",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if (selectup1.equals("Basico"))
                    {
                        Toast.makeText(getActivity(),"Aplicacion en desarrollo",Toast.LENGTH_SHORT).show();
                    }
                    else if (selectup1.equals("Cientifico"))
                    {
                        Intent intent = new Intent(getActivity(), CalculadoraCientifica.class);
                        intent.putExtra("APP: ",selectup1 );
                        intent.putExtra("Bienvenido: ",username );
                        startActivity(intent);
                        getActivity().finish();


                    }
                    else if (selectup1.equals("Costum"))
                    {
                        Intent intent = new Intent(getActivity(), CalculadoraCostum.class);
                        intent.putExtra("APP: ",selectup1 );
                        intent.putExtra("Bienvenido: ",username );
                        startActivity(intent);
                        getActivity().finish();


                    }




                }
            }
        });

    }

}
