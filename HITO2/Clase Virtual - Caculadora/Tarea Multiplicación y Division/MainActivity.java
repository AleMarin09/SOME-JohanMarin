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

        int multi = num1 * num2;

        String res = String.valueOf(multi);
        txResultado1.setText(res);

    }
    // Resta
    public void MetodoResta (View View2 )
    {
        String valor3 = et3.getText().toString();
        String valor4 = et4.getText().toString();

        double num3= Double.parseDouble(valor3) ;
        double num4 = Double.parseDouble(valor4);

        double divi = num3 / num4;

        String res1 = String.valueOf(divi);
        tvRes.setText(res1);

    }
}
