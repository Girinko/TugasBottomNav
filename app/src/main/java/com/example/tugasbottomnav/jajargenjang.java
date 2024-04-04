package com.example.tugasbottomnav;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class jajargenjang extends AppCompatActivity {

    private EditText editTextBase;
    private EditText editTextHeight;
    private Button buttonCalculate;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jajargenjang);

        editTextBase = findViewById(R.id.editTextBase);
        editTextHeight = findViewById(R.id.editTextHeight);
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
        // Mendapatkan nilai alas dari EditText dan mengonversi ke tipe data float
        float base = Float.parseFloat(editTextBase.getText().toString());

        // Mendapatkan nilai tinggi dari EditText dan mengonversi ke tipe data float
        float height = Float.parseFloat(editTextHeight.getText().toString());

        // Menghitung luas jajargenjang
        float area = base * height;

        // Menampilkan hasil di TextView
        textViewResult.setText("Result: " + area);
    }
}