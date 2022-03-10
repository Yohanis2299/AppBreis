package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AppBreis extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appbreis);

        getSupportActionBar().hide();

        Button bt_enter = (Button) findViewById(R.id.bt_enter);
        bt_enter.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                Intent it = new Intent(AppBreis.this, FormBemVindo.class);
                startActivity(it);
            }
        });
        findViewById(R.id.bt_adm).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAdmMode();
            }
        });

        }
    private void openAdmMode(){
        Intent intent =  new Intent(this, FormBemVindoAdm.class);
        startActivity(intent);
    }
    }


