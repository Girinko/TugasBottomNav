package com.example.tugasbottomnav;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class persegi extends AppCompatActivity {

    private EditText editTextSide;
    private Button buttonCalculate;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);
        editTextSide = findViewById(R.id.editTextSide);
        buttonCalculate = findViewById(R.id.buttonCalculate);
        textViewResult = findViewById(R.id.textViewResult);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateArea();
            }
        });
    }
    private void calculateArea() {

        String sideText = editTextSide.getText().toString();
        if (sideText.isEmpty()) {
            textViewResult.setText("Please enter a side length");
            return;
        }
        double side = Double.parseDouble(sideText);

        double area = side * side;

        textViewResult.setText("Luas: " + area);
    }
}