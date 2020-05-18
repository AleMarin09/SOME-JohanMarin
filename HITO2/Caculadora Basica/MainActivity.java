package com.example.myfirstapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Button butt1;
    private TextView text1;
    private  EditText editText1;
    private  EditText num1;
    private  EditText num2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializaVariables();

    }

    public void initializaVariables()
    {

        butt1 = findViewById(R.id.button1);
        butt1.setText("Suma");
        butt1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View V)
            {
                String Contenido = num1.getText().toString();
                String Contenido2 = num2.getText().toString();
                int suma = Contenido.intparse + Contenido2.intparse
            }
        });

        text1 = findViewById(R.id.text1);
        text1.setText("Estudiante: Johan Marin");


        editText1= findViewById(R.id.edittext1);

        String contenido = edittext1.getText().toString();

        text1.setText(contenido.toString());


    }



}
