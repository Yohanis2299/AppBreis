package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FormBemVindoAdm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_bemvindo_adm);
        getSupportActionBar().hide();

        findViewById(R.id.bt_gerenproj).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGerenProj();
            }
        });
        findViewById(R.id.bt_gerenClient).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGerenClient();
            }
        });
        findViewById(R.id.bt_gerenUser).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGerenUser();
            }
        });
        findViewById(R.id.bt_buscarApont).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openApont();
            }
        });
    }
    private void openGerenProj(){
        Intent intent =  new Intent(this, FormGerenciarProj.class);
        startActivity(intent);
    }
    private void openGerenClient(){
        Intent intent =  new Intent(this, FormGerenciarClient.class);
        startActivity(intent);
    }
    private void openGerenUser(){
        Intent intent =  new Intent(this, FormGerenciarUser.class);
        startActivity(intent);
    }
    private void openApont(){
        Intent intent =  new Intent(this, FormApontAdm.class);
        startActivity(intent);
    }
}