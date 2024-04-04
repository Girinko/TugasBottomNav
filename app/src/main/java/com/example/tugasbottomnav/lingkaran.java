package com.example.tugasbottomnav;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;

public class lingkaran extends AppCompatActivity {

    private EditText editTextRadius;
    private Button buttonCalculate;
    private TextView textViewResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        editTextRadius = findViewById(R.id.editTextRadius);
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
        // Mendapatkan nilai jari-jari dari EditText dan mengonversi ke tipe data float
        float radius = Float.parseFloat(editTextRadius.getText().toString());

        // Menghitung luas lingkaran
        float area = 3.14f * radius * radius; // Pi * r^2

        // Menampilkan hasil di TextView
        textViewResult.setText("Result: " + area);
    }

}