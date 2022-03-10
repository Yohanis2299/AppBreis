package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class FormBemVindo extends AppCompatActivity {

    ImageButton androidImageButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_bemvindoxml);

        getSupportActionBar().hide();


        androidImageButton= (ImageButton) findViewById(R.id.bt_back);
        androidImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBackPage();
            }
        });

        androidImageButton= (ImageButton) findViewById(R.id.bt_Profile);
        androidImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openProfile();
            }
        });

        Button bt_enter = (Button) findViewById(R.id.bt_buscarApont);
        bt_enter.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                Intent it = new Intent(FormBemVindo.this, FormApontamento.class);
                startActivity(it);
            }
        });
        findViewById(R.id.bt_meusApont).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMeusApont();
            }
        });
    }
    private void openBackPage(){
        Intent intent =  new Intent(this, AppBreis.class);
        startActivity(intent);
    }
    private void openProfile(){
        Intent intent =  new Intent(this, FormProfile.class);
        startActivity(intent);
    }
    private void openMeusApont(){
        Intent intent =  new Intent(this, ListaApontamento.class);
        startActivity(intent);
    }

}