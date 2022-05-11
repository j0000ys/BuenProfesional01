package com.example.buenprofesional;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;


public class Registro extends AppCompatActivity {
    private EditText nom1;
    private EditText apel1;
    private EditText email;
    private EditText cont1;
    private EditText cont2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        nom1=(EditText)findViewById(R.id.nom1);
        apel1=(EditText)findViewById(R.id.apel1);
        email=(EditText)findViewById(R.id.email);
        cont1=(EditText)findViewById(R.id.cont1);
        cont2=(EditText)findViewById(R.id.cont2);
    }
}