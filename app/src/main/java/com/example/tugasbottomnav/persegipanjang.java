package com.example.tugasbottomnav;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;

public class persegipanjang extends AppCompatActivity {

    private EditText editTextLength;
    private EditText editTextWidth;
    private Button buttonCalculate;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegipanjang);

        editTextLength = findViewById(R.id.editTextLength);
        editTextWidth = findViewById(R.id.editTextWidth);
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
        // Mendapatkan nilai panjang dari EditText dan mengonversi ke tipe data float
        float length = Float.parseFloat(editTextLength.getText().toString());

        // Mendapatkan nilai lebar dari EditText dan mengonversi ke tipe data float
        float width = Float.parseFloat(editTextWidth.getText().toString());

        // Menghitung luas persegi panjang
        float area = length * width;

        // Menampilkan hasil di TextView
        textViewResult.setText("Result: " + area);
    }
}