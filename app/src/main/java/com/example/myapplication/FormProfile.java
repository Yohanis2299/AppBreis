package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class FormProfile extends AppCompatActivity {

    ImageButton androidImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_profile);
        getSupportActionBar().hide();

        androidImageButton= (ImageButton) findViewById(R.id.bt_back);
        androidImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBackPage();
            }
        });
    }
    private void openBackPage(){
        Intent intent =  new Intent(this, FormBemVindo.class);
        startActivity(intent);
    }
}