package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ListaApontamento extends AppCompatActivity {

    ImageButton androidImageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_apontamento);
        getSupportActionBar().hide();

        findViewById(R.id.bt_backpage).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backPage();
            }
        });
        androidImageButton= (ImageButton) findViewById(R.id.bt_profile);
        androidImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openProfile();
            }
        });
        androidImageButton= (ImageButton) findViewById(R.id.bt_home);
        androidImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHome();
            }
        });
    }
    private void backPage(){
        Intent intent =  new Intent(ListaApontamento.this, FormBemVindo.class);
        startActivity(intent);
    }
    private void openProfile(){
        Intent intent =  new Intent(ListaApontamento.this, FormProfile.class);
        startActivity(intent);
    }
    private void openHome(){
        Intent intent =  new Intent(ListaApontamento.this, FormBemVindo.class);
        startActivity(intent);
    }
}