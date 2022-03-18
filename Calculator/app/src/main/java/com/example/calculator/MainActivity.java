package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sum = findViewById(R.id.sum);
        Button subtract = findViewById(R.id.sub);
        Button multiply = findViewById(R.id.mul);
        Button remainder = findViewById(R.id.rem);
        Button divide = findViewById(R.id.div);
        TextView answer = findViewById(R.id.textView);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText num1 = findViewById(R.id.num1);
                EditText num2 = findViewById(R.id.num2);
                double n1 = Double.parseDouble(num1.getText().toString());
                double n2 = Double.parseDouble(num2.getText().toString());
                answer.setText(String.valueOf(n1+n2));
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText num1 = findViewById(R.id.num1);
                EditText num2 = findViewById(R.id.num2);
                double n1 = Double.parseDouble(num1.getText().toString());
                double n2 = Double.parseDouble(num2.getText().toString());
                answer.setText(String.valueOf(n1-n2));
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText num1 = findViewById(R.id.num1);
                EditText num2 = findViewById(R.id.num2);
                double n1 = Double.parseDouble(num1.getText().toString());
                double n2 = Double.parseDouble(num2.getText().toString());
                answer.setText(String.valueOf(n1*n2));
            }
        });

        remainder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText num1 = findViewById(R.id.num1);
                EditText num2 = findViewById(R.id.num2);
                double n1 = Double.parseDouble(num1.getText().toString());
                double n2 = Double.parseDouble(num2.getText().toString());
                answer.setText(String.valueOf(n1%n2));
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText num1 = findViewById(R.id.num1);
                EditText num2 = findViewById(R.id.num2);
                double n1 = Double.parseDouble(num1.getText().toString());
                double n2 = Double.parseDouble(num2.getText().toString());
                answer.setText(String.valueOf(n1/n2));
            }
        });

    }
}