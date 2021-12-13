package com.example.pas2021fera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityMangga extends AppCompatActivity {
    Button btnMangga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mangga);
        btnMangga = (Button) findViewById(R.id.btn_mgga);

        btnMangga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnMangga = new Intent(ActivityMangga.this, FotoMangga.class);
                startActivity(pindahBtnMangga);
            }
        });

    }
}