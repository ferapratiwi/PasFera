package com.example.pas2021fera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityRambutan extends AppCompatActivity {
    Button btnRambutan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rambutan);
        btnRambutan=(Button) findViewById(R.id.btn_rmbtn);

        btnRambutan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnFotoRambutan = new Intent(ActivityRambutan.this, FotoRambutan.class);
                startActivity(pindahBtnFotoRambutan);
            }
        });
    }
}