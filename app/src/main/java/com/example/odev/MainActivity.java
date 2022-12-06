package com.example.odev;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText number1;
    EditText number2;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button_Kontrol);
        number1 = findViewById(R.id.editTextNumber1);
        number2 = findViewById(R.id.editTextNumber2);
    }

    public void Kontrol(View view) {
        int sayi1 = Integer.parseInt(number1.getText().toString());
        int sayi2 = Integer.parseInt(number2.getText().toString());
        if (sayi1 > sayi2) {
            Toast.makeText(this, "1.Sayı Daha Büyük.", Toast.LENGTH_LONG).show();

        }
        if (sayi2 > sayi1) {
            Toast.makeText(this, "2.Sayı Daha Büyük.", Toast.LENGTH_LONG).show();

        }
        if (sayi1 == sayi2) {
            Toast.makeText(this, "İki Sayı Eşittir", Toast.LENGTH_LONG).show();
        }
    }
}