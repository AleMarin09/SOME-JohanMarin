package com.example.pruebanuevointalacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText editText1;
    private EditText editText2;
    private TextView txResultado1;

    private EditText et3;
    private EditText et4;
    private TextView tvRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText)findViewById(R.id.et1);
        editText2 = (EditText)findViewById(R.id.et2);
        txResultado1 = (TextView)findViewById(R.id.resultadoSuma);

        et3 = (EditText)findViewById(R.id.et3);
        et4 = (EditText)findViewById(R.id.et4);
        tvRes = (TextView)findViewById(R.id.tvRes);
    }

    //suma
    public void MetodoSuma(View View )
    {
        String valor1 = editText1.getText().toString();
        String valor2 = editText2.getText().toString();

        int num1= Integer.parseInt(valor1) ;
        int num2 = Integer.parseInt(valor2);

        int suma = num1 + num2;

        String res = String.valueOf(suma);
        txResultado1.setText(res);

    }
    // Resta
    public void MetodoResta (View View2 )
    {
        String valor3 = et3.getText().toString();
        String valor4 = et4.getText().toString();

        int num3= Integer.parseInt(valor3) ;
        int num4 = Integer.parseInt(valor4);

        int suma1 = num3 - num4;

        String res1 = String.valueOf(suma1);
        tvRes.setText(res1);

    }
}
