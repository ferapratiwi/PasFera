package com.example.pas2021fera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FotoMangga extends AppCompatActivity {
    Button btnBackFotoMangga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foto_mangga);
        btnBackFotoMangga=(Button) findViewById(R.id.btn_mgg);

        btnBackFotoMangga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnFotomangga = new Intent(FotoMangga.this,MainActivity.class);
                startActivity(pindahBtnFotomangga);
            }
        });
    }
}