package com.example.hito2johanalejandromarinmontoya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText num1, num2, departamento, etnumcasoscocha, etnumsospechososcocha,
            etnumcasossanta, etnumsospechosossanta, etnumcasosoruro, etnumsospechososoruro,
            edtext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        etnumcasoscocha = findViewById(R.id.etnumcasoscocha);
        etnumsospechososcocha = findViewById(R.id.etnumsospechososcocha);

        etnumcasossanta = findViewById(R.id.etnumcasossanta);
        etnumsospechosossanta = findViewById(R.id.etnumsospechosossanta);

        etnumcasosoruro = findViewById(R.id.etnumcasosoruro);
        etnumsospechososoruro = findViewById(R.id.etnumsospechososoruro);

        departamento = findViewById(R.id.departamento);


        edtext = findViewById(R.id.edtext);


    }

    public void Mandar(View v) {
        String depa = departamento.getText().toString();
        if (depa.equals("Cochabamba")) {
            String num1cocha = num1.getText().toString();
            etnumcasoscocha.setText(num1cocha);
            String num2cocha = num2.getText().toString();
            etnumsospechososcocha.setText(num2cocha);


        } else if (depa.equals("Santa Cruz")) {
            String num1santa = num1.getText().toString();
            etnumcasossanta.setText(num1santa);
            String num2santa = num2.getText().toString();
            etnumsospechosossanta.setText(num2santa);


        } else if (depa.equals("Oruro")) {
            String num1oruro = num1.getText().toString();
            etnumcasosoruro.setText(num1oruro);
            String num2oruro = num2.getText().toString();
            etnumsospechososoruro.setText(num2oruro);


        }

    }


    public void Calcular(View view) {
        String textbusqueda = edtext.getText().toString();
        if (textbusqueda.equals("Confirmados")) {
            String valor1 = etnumcasoscocha.getText().toString();
            String valor2 = etnumcasossanta.getText().toString();
            String valor3 = etnumcasosoruro.getText().toString();
            int valor11 = Integer.parseInt(valor1);
            int valor22 = Integer.parseInt(valor2);
            int valor33 = Integer.parseInt(valor3);

            if (valor11 > valor22 && valor11 > valor33) {
                Toast.makeText(this, "Cochabamba" + valor11, Toast.LENGTH_LONG).show();

            } else if (valor22 > valor11 && valor22 > valor33) {
                Toast.makeText(this, "Santa Cruz" + valor22, Toast.LENGTH_LONG).show();

            } else {
                Toast.makeText(this, "Oruro" + valor33, Toast.LENGTH_LONG).show();

            }

        } else if (textbusqueda.equals("Sospechosos")) {
            String valor1 = etnumsospechososcocha.getText().toString();
            String valor2 = etnumsospechosossanta.getText().toString();
            String valor3 = etnumsospechososoruro.getText().toString();
            int valor11 = Integer.parseInt(valor1);
            int valor22 = Integer.parseInt(valor2);
            int valor33 = Integer.parseInt(valor3);

            if (valor11 > valor22 && valor11 > valor33) {
                Toast.makeText(this, "Cochabamba" + valor11, Toast.LENGTH_LONG).show();

            } else if (valor22 > valor11 && valor22 > valor33) {
                Toast.makeText(this, "Cochabamba" + valor11, Toast.LENGTH_LONG).show();

            } else {
                Toast.makeText(this, "Cochabamba" + valor11, Toast.LENGTH_LONG).show();

            }

        }
    }
}