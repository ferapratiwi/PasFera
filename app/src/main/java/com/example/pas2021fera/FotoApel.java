package com.example.pas2021fera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FotoApel extends AppCompatActivity {
    Button btnBackFotoApel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foto_apel);
        btnBackFotoApel=(Button) findViewById(R.id.btn_apl);

        btnBackFotoApel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnFotoApel = new Intent(FotoApel.this,MainActivity.class);
                startActivity(pindahBtnFotoApel);
            }
        });
    }
}