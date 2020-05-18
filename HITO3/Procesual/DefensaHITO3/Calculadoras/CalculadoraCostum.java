package com.e.hito3_johanalejandromarinmontoya.Calculadoras;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.TextView;

import com.e.hito3_johanalejandromarinmontoya.R;

public class CalculadoraCostum extends AppCompatActivity   {

    private boolean EO=false;
    private EditText pantalla;
    private Button b1,b2,b3,b4,b0;
    private Button suma,resta,mul,divi,igu;
    private Button facc, C,facto,shift, x2, x3, znu;
    private double aux1=0,aux2=0;
    private String aux3="";
    private char letra;
    public double res;
    private TextView tvShowUsername,tvShowSelect;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_costum);
        _initialize();
        _addClickDoneAndPrev();
    }

    public void _initialize() {

        facto=(Button)findViewById(R.id.facto);
        znu=(Button)findViewById(R.id.znu);
        x2=(Button)findViewById(R.id.x2);
        x3=(Button)findViewById(R.id.x3);
        facc= (Button) findViewById(R.id.facc);
        b0=(Button)findViewById(R.id.b0);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        suma=(Button)findViewById(R.id.editsum);
        resta=(Button)findViewById(R.id.editres);
        mul=(Button)findViewById(R.id.editmul);
        divi=(Button)findViewById(R.id.editdiv);
        igu=(Button)findViewById(R.id.editigual);

        pantalla=(EditText)findViewById(R.id.caja);
        C=(Button)findViewById(R.id.editlimpiar);

        shift=(Button)findViewById(R.id.btnshift);
        tvShowSelect = findViewById(R.id.tvShowSelect);
        String APP = getIntent().getStringExtra("APP: ");
        String msg1 = "APP: "+ APP;
        tvShowSelect.setText(msg1);

        tvShowUsername = findViewById(R.id.tvShowUsername);
        String username = getIntent().getStringExtra("Bienvenido: ");
        String msg = "BIENVENIDO: " + username;
        tvShowUsername.setText(msg);

    }
    public void _addClickDoneAndPrev() {
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                aux3=pantalla.getText().toString();
                aux3+=0;
                pantalla.setText(aux3);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux3=pantalla.getText().toString();
                aux3+=1;
                pantalla.setText(aux3);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux3=pantalla.getText().toString();
                aux3+=2;
                pantalla.setText(aux3);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux3=pantalla.getText().toString();
                aux3+=3;
                pantalla.setText(aux3);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux3=pantalla.getText().toString();
                aux3+=4;
                pantalla.setText(aux3);
            }
        });


        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(aux1==0)
                {
                    aux1=Double.parseDouble(pantalla.getText().toString());
                }
                else
                {
                    aux1+=Double.parseDouble(pantalla.getText().toString());
                }
                pantalla.setText("");
                letra='+';
            }
        });
        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(aux1==0)
                {
                    aux1=Double.parseDouble(pantalla.getText().toString());

                }
                else
                {
                    aux1-=Double.parseDouble(pantalla.getText().toString());
                }
                pantalla.setText("");
                letra='-';
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(aux1==0)
                {
                    aux1=Double.parseDouble(pantalla.getText().toString());
                }
                else
                {
                    aux1*=Double.parseDouble(pantalla.getText().toString());
                }
                pantalla.setText("");
                letra='*';
            }
        });
        divi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(aux1==0)
                {
                    aux1=Double.parseDouble(pantalla.getText().toString());
                }
                else
                {
                    aux1/=Double.parseDouble(pantalla.getText().toString());
                }
                pantalla.setText("");
                letra='/';
            }
        });
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux1=0;
                aux2=0;
                aux3="";
                letra=' ';
                pantalla.setText("");
            }
        });


        facc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double x,x2=1;
                x=Double.parseDouble(pantalla.getText().toString());
                for(int i=1;i<=x;i++)
                {  x2*=i; }
                pantalla.setText(""+x2);
            }
        });

        igu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux2=Double.parseDouble(pantalla.getText().toString());
                pantalla.setText("");
                switch (letra)
                {
                    case '+': {
                        pantalla.setText(""+ (aux1+aux2));
                        break;
                    }
                    case '-': {
                        pantalla.setText(""+ (aux1-aux2));
                        break;
                    }
                    case '*': {
                        pantalla.setText(""+ (aux1*aux2));
                        break;
                    }
                    case '/':
                    {
                        pantalla.setText(""+ (aux1/aux2));
                        break;
                    }
                    case 's':
                    {
                        pantalla.setText(""+(aux2*aux1)/100);
                        break;
                    }
                    case 'x':
                    {
                        pantalla.setText(""+(Math.pow(aux1,aux2)));
                        break;
                    }
                    case 'z':
                    {
                        for(Double i = aux1;i<=aux2;i++)
                        {
                            res = res+i;
                        }
                        pantalla.setText(""+res);

                        break;
                    }
                }
            }
        });

        shift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(EO==false)
                {
                    x2.setText("x3");
                    x3.setText("xy");
                    facto.setText("zfibo");
                    znu.setText("znxy");
                    EO=true;
                }
                else
                {   x2.setText("x2");
                    x3.setText("x3");
                    facto.setText("fac");
                    znu.setText("znu");
                    EO=false;
                }
            }
        });
        x2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double x2;
                x2=Double.parseDouble(pantalla.getText().toString());
                if(EO==false)
                {
                    pantalla.setText(""+(Math.pow(x2,2)));
                }
                else
                {
                    pantalla.setText(""+(Math.pow(x2,3)));
                }

            }
        });
        x3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double x;
                x=Double.parseDouble(pantalla.getText().toString());
                if(EO==false)
                {
                    pantalla.setText(""+(Math.pow(x,3)));
                }
                else
                {
                    aux1=Double.parseDouble(pantalla.getText().toString());
                    pantalla.setText("");
                    letra='x';
                }
            }
        });
        znu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double x1;
                double x2=1, y;
                x1=Double.parseDouble(pantalla.getText().toString());
                if(EO==false)
                {
                    //sumatoria numeros
                    for(int i=1;i<=x1;i++)
                    {  x2+=i; }
                    pantalla.setText(""+x2);

                }
                else
                {    aux1=Double.parseDouble(pantalla.getText().toString());
                    pantalla.setText("");

                    letra='z';

                }
            }
        });
        facto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               double x,x2=1;
                int f =0;
                int t1 =1;
                int t2;
                int sum =0;
                x=Double.parseDouble(pantalla.getText().toString());
                if(EO==false)
                {
                    for(int i=1;i<=x;i++)
                    {  x2*=i; }
                    pantalla.setText(""+x2);
                }
                else
                {
                    ///fibo   auxi =x  op1 = auxi
                    for(double i = 1;i<=x;i++)
                    {
                        t2 = f;
                        f = t1 +f;
                        t1 = t2;
                        sum = sum + t1;
                    }
                    pantalla.setText(""+sum);
                }
            }
        });

    }
    }

