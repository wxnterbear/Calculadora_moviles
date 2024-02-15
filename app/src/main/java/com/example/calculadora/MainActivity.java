package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Ma m = new Ma();
    private Button resultadoPagina;
    private Button sum;
    private Button res;
    private Button mult;
    private Button div;
    private Button pot;
    private Button suc;
    private Button fact;
    private TextView mensaje;
    private EditText num1;
    private EditText num2;
    Intent intent = new Intent(MainActivity.this, Resultado.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mensaje = findViewById(R.id.cajares);
        num1 = findViewById(R.id.dato1);
        num2 = findViewById(R.id.dato2);

        sum = findViewById(R.id.button);
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double resultado = m.funcionSuma(Double.parseDouble(num1.getText().toString()), Integer.parseInt(num2.getText().toString()));
                intent.putExtra("resultado", resultado);
                startActivity(intent);
            }
        });

        res = findViewById(R.id.button2);
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double resultado = m.funcionResta(Double.parseDouble(num1.getText().toString()), Double.parseDouble(num2.getText().toString()));
                intent.putExtra("resultado", resultado);
                startActivity(intent);
            }
        });

        mult = findViewById(R.id.button3);
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double resultado = m.funcionMultiplicacion(Double.parseDouble(num1.getText().toString()), Double.parseDouble(num2.getText().toString()));
                intent.putExtra("resultado", resultado);
                startActivity(intent);
            }
        });

        div = findViewById(R.id.button4);
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double resultado = m.funcionDivision(Double.parseDouble(num1.getText().toString()), Double.parseDouble(num2.getText().toString()));
                intent.putExtra("resultado", resultado);
                startActivity(intent);
            }
        });

        pot = findViewById(R.id.button5);
        pot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double resultado = m.funcionPotencia(Double.parseDouble(num1.getText().toString()), Double.parseDouble(num2.getText().toString()));
                intent.putExtra("resultado", resultado);
                startActivity(intent);
            }
        });


        fact = findViewById(R.id.button7);
        fact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double resultado = m.funcionFactorial(Double.parseDouble(num1.getText().toString()));
                intent.putExtra("resultado", resultado);
                startActivity(intent);
            }
        });

        suc = findViewById(R.id.button6);
        suc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                long resultado = m.funcionSucesion(Long.parseLong(num1.getText().toString()));
                intent.putExtra("resultado", resultado);
                startActivity(intent);
            }
        });
    }






}