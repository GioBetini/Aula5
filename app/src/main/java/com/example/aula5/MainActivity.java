package com.example.aula5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etQtdDados;
    private EditText etQtdLados;
    private Button btnCalc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etQtdDados = findViewById(R.id.etQtdDados);
        etQtdLados = findViewById(R.id.etQtdFaces);
        btnCalc = findViewById(R.id.btnRolar);

    }
    private void rolar(){

    }
}