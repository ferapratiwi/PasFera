package com.example.pas2021fera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FotoRambutan extends AppCompatActivity {
    Button btnBackFotoRambutan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foto_rambutan);
        btnBackFotoRambutan = (Button) findViewById(R.id.btn_rmbt);

        btnBackFotoRambutan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnFotoRambutan = new Intent(FotoRambutan.this, MainActivity.class);
                startActivity(pindahBtnFotoRambutan);
            }
        });
    }
}
