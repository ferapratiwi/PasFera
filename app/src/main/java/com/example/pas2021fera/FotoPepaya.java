package com.example.pas2021fera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FotoPepaya extends AppCompatActivity {
    Button btnBackFotoPepaya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foto_pepaya);
        btnBackFotoPepaya = (Button) findViewById(R.id.btn_ppy);

        btnBackFotoPepaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnFotoPepaya = new Intent(FotoPepaya.this, MainActivity.class);
                startActivity(pindahBtnFotoPepaya);
            }
        });
    }
}
