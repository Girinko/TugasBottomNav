package com.example.tugasbottomnav;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class segitiga extends AppCompatActivity {

    EditText editTextBase, editTextHeight;
    Button buttonCalculate;
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        editTextBase = findViewById(R.id.editTextBase);
        editTextHeight = findViewById(R.id.editTextHeight);
        buttonCalculate = findViewById(R.id.buttonCalculate);
        textViewResult = findViewById(R.id.textViewResult);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mengambil nilai alas dan tinggi dari EditText
                String baseStr = editTextBase.getText().toString().trim();
                String heightStr = editTextHeight.getText().toString().trim();

                // Memeriksa apakah ada input yang kosong
                if (!baseStr.isEmpty() && !heightStr.isEmpty()) {
                    // Mengonversi input menjadi bilangan desimal
                    double base = Double.parseDouble(baseStr);
                    double height = Double.parseDouble(heightStr);

                    // Menghitung luas segitiga
                    double area = 0.5 * base * height;

                    // Menampilkan hasil perhitungan
                    textViewResult.setText("Hasil: " + String.valueOf(area));
                } else {
                    // Jika ada input yang kosong, tampilkan pesan kesalahan
                    textViewResult.setText("Mohon masukkan nilai alas dan tinggi");
                }
            }
        });

    }
}