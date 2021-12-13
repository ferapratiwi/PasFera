package com.example.pas2021fera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityPepaya extends AppCompatActivity {
    Button btnpepaya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pepaya);
        btnpepaya=(Button) findViewById(R.id.btn_pp);

        btnpepaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnpepaya = new Intent(ActivityPepaya.this,FotoPepaya.class);
                startActivity(pindahBtnpepaya);
            }
        });
    }
}