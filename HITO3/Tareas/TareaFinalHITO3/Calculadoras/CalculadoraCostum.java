package com.e.hito3_johanalejandromarinmontoya.Calculadoras;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

import com.e.hito3_johanalejandromarinmontoya.R;

public class CalculadoraCostum extends AppCompatActivity  implements View.OnClickListener {

    public Button btnsuma, btnresta, btnmulti, btndiv, btnigual, btnfac, btnsen, btntan, btnshift, btncero, btnuno, btndos, btncinco;
    public EditText etpantalla;
    public double op1 = 0.0;
    public double op2;
    public double res;
    public String operacion; //identificador para las operaciones

    public int c = 0;
    public Double op3 = 1.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_costum);
        initializeVariables();
    }

    public void initializeVariables() {

        etpantalla = findViewById(R.id.texto);
        btncero = findViewById(R.id.btcero);
        btnuno = findViewById(R.id.btuno);
        btndos = findViewById(R.id.btdos);
        btncinco = findViewById(R.id.btcuatro);
        btnsuma = findViewById(R.id.btsuma);
        btnresta = findViewById(R.id.btresta);
        btnmulti = findViewById(R.id.btmulti);
        btndiv = findViewById(R.id.btdiv);
        btnigual = findViewById(R.id.btigual);
        btnfac = findViewById(R.id.btfact);
        btnsen = findViewById(R.id.btsen);
        btntan = findViewById(R.id.bttan);
        btnshift = findViewById(R.id.btshift);
        btncero.setOnClickListener(this);
        btnuno.setOnClickListener(this);
        btndos.setOnClickListener(this);
        btncinco.setOnClickListener(this);
        btnsuma.setOnClickListener(this);
        btnresta.setOnClickListener(this);
        btnmulti.setOnClickListener(this);
        btndiv.setOnClickListener(this);
        btnigual.setOnClickListener(this);
        btnfac.setOnClickListener(this);
        btnsen.setOnClickListener(this);
        btntan.setOnClickListener(this);
        btnshift.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btcero:
                String capc = etpantalla.getText().toString();
                capc = capc + "0";
                etpantalla.setText(capc);
                break;
            case R.id.btuno:
                String cap = etpantalla.getText().toString();
                cap = cap + "1";
                etpantalla.setText(cap);
                break;
            case R.id.btdos:
                String cap1 = etpantalla.getText().toString();
                cap1 = cap1 + "2";
                etpantalla.setText(cap1);
                break;
            case R.id.bttres:
                String cap3 = etpantalla.getText().toString();
                cap3 = cap3 + "3";
            case R.id.btcuatro:
                String cap4 = etpantalla.getText().toString();
                cap3 = cap4 + "4";
                etpantalla.setText(cap3);
                break;
            case R.id.btsuma:
                suma();
                break;
            case R.id.btresta:
                resta();
                break;
            case R.id.btmulti:
                multi();
                break;
            case R.id.btdiv:
                div();
                break;
            case R.id.btigual:
                signos();
                break;
            case R.id.btshift:
                String mod1, mod2, mod3;
                mod1 = btnfac.getText().toString();
                if (mod1.equals("!f")) {
                    btnfac.setText("x2");
                    btnsen.setText("sen-1");
                    btntan.setText("tan-1");
                } else {
                    btnfac.setText("!f");
                    btnsen.setText("sen");
                    btntan.setText("tan");
                }
                break;
            case R.id.btfact:
                factorial();
                break;
            case R.id.btsen:
                resseno();
                break;
            case R.id.bttan:
                restan();
                break;
            case R.id.btborrar:
                borrar();
                break;
        }
    }

    public void factorial() {
        String mod = btnfac.getText().toString();
        if (mod.equals("!f")) {
            double fact = 1.0;
            String auxi = etpantalla.getText().toString();
            Double op11 = Double.parseDouble(auxi);
            for (Double i = op11; i > 0; i--) {
                fact = fact * i;
            }
            etpantalla.setText("" + fact);
        } else {
            String a = etpantalla.getText().toString();
            Double cua = Double.parseDouble(a);
            Double resp = Math.pow(cua, 2);
            etpantalla.setText("" + resp);
        }
    }

    public void signos() {
        try {
            String auxi2 = etpantalla.getText().toString();
            op2 = Double.parseDouble(auxi2);

        } catch (NumberFormatException e) {
        }

        etpantalla.setText("");
        if (operacion.equals("suma")) {
            res = op1 + op2;

        } else if (operacion.equals("resta")) {
            res = op1 - op2;
        } else if (operacion.equals("multi")) {
            res = op1 * op2;
        } else if (operacion.equals("div")) {
            if (op2 == 0) {
                etpantalla.setText("no puede dividir entre cero");
            } else {
                res = op1 / op2;
            }
        }


        etpantalla.setText("" + res);

        op1 = 0.0;
        op3 = 1.0;
        c = 0;
    }


    public void suma() {
        try {
            String auxi = etpantalla.getText().toString();
            op1 = op1 + Double.parseDouble(auxi);
        } catch (NumberFormatException e) {

        }
        etpantalla.setText("");
        operacion = "suma";
    }

    public void resta() {
        try {
            op1 = 0;
            if (c < 1) {
                String auxi = etpantalla.getText().toString();
                op1 = (Double.parseDouble(auxi)) - op1;
                op3 = op1;
            } else if (c > 0) {
                String auxi = etpantalla.getText().toString();
                op1 = op3 - (Double.parseDouble(auxi));
            }
            //limpiar pantalla al preionar suma
        } catch (NumberFormatException e) {

        }
        etpantalla.setText("");
        operacion = "resta";
        c++;
    }

    public void multi() {
        try {
            op1 = 1;
            String auxi = etpantalla.getText().toString();
            op1 = op3 * Double.parseDouble(auxi);
            op3 = op1;

        } catch (NumberFormatException e) {

        }
        etpantalla.setText("");
        operacion = "multi";
    }
    public void borrar() {

        etpantalla.setText("");

    }

    public void div() {
        try {

            if (c < 1) {
                String auxi = etpantalla.getText().toString();
                op1 = Double.parseDouble(auxi) / op3;
                op3 = op1;
            } else if (c > 0) {
                String auxi = etpantalla.getText().toString();
                op1 = op3 / Double.parseDouble(auxi);
                op3 = op1;
            }
            //limpiar pantalla al preionar suma

        } catch (NumberFormatException e) {

        }
        etpantalla.setText("");
        operacion = "divi";
        c++;
    }

    public void resseno() {
        String mod = btnsen.getText().toString();
        if (mod.equals("sen")) {
            Double op2, op3;
            String auxi3 = etpantalla.getText().toString();
            op2 = Double.parseDouble(auxi3);
            op3 = Math.sin(op2 * Math.PI / 180);
            etpantalla.setText("" + op3);
        } else {
            Double op2, op3;
            String auxi3 = etpantalla.getText().toString();
            op2 = Double.parseDouble(auxi3);
            op3 = Math.asin(op2 * Math.PI / 180);
            etpantalla.setText("" + op3);
        }
    }

    public void restan() {
        String mod = btntan.getText().toString();
        if (mod.equals("tan")) {
            Double opp2, opp3;
            String tan = etpantalla.getText().toString();
            opp2 = Double.parseDouble(tan);
            opp3 = Math.tan(opp2 * Math.PI / 180);
            etpantalla.setText("" + opp3);
        } else {
            Double opp2, opp3;
            String tan = etpantalla.getText().toString();
            opp2 = Double.parseDouble(tan);
            opp3 = Math.atan(opp2 * Math.PI / 180);
            etpantalla.setText("" + opp3);
        }
    }
}