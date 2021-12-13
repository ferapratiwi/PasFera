package com.example.pas2021fera;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.sax.StartElementListener;
import android.view.View;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {
     CircleImageView  imageMangga,imagePepaya,imageApel,imageRambutan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageMangga=(CircleImageView) findViewById(R.id.mangga);
        imagePepaya=(CircleImageView) findViewById(R.id.pepaya);
        imageApel=(CircleImageView) findViewById(R.id.apel);
        imageRambutan=(CircleImageView) findViewById(R.id.rambutan);

        imageMangga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahMangga = new Intent(MainActivity.this,ActivityMangga.class);
                startActivity(pindahMangga);
            }
        });
        imagePepaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahPepaya = new Intent(MainActivity.this,ActivityPepaya.class);
                startActivity(pindahPepaya);
            }
        });
        imageApel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahApel =new Intent(MainActivity.this,ActivityApel.class);
                startActivity(pindahApel);
            }
        });
        imageRambutan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahRambutan =new Intent(MainActivity.this,ActivityRambutan.class);
                startActivity(pindahRambutan);
            }
        });
    }
}