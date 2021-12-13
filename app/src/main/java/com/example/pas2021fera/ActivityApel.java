package com.example.pas2021fera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityApel extends AppCompatActivity {
    Button btnApel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apel);
        btnApel=(Button) findViewById(R.id.btn_apple);

        btnApel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnApel = new Intent(ActivityApel.this,FotoApel.class);
                startActivity(pindahBtnApel);
            }
        });
    }
}