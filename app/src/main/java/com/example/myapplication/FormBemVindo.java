package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class FormBemVindo extends AppCompatActivity {

    ImageButton androidImageButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_bemvindoxml);

        getSupportActionBar().hide();


        androidImageButton= (ImageButton) findViewById(R.id.bt_profile);
        androidImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openProfile();
            }
        });

        Button bt_enter = (Button) findViewById(R.id.bt_addApont);
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
        findViewById(R.id.bt_logoff).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exibirConfirmacao();
            }
        });
    }
    public void exibirConfirmacao() {

        AlertDialog.Builder msgBox = new AlertDialog.Builder(this);
        msgBox.setTitle("Saindo...");
        msgBox.setIcon(android.R.drawable.ic_menu_close_clear_cancel);
        msgBox.setMessage("Deseja sair do app?");
        msgBox.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int witch) {
                Toast.makeText(FormBemVindo.this, "LogOff",
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(FormBemVindo.this,
                        AppBreis.class);
                startActivity(intent);
            }
        });
        msgBox.setNegativeButton("Nao", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(FormBemVindo.this, "Cancelado",
                        Toast.LENGTH_SHORT).show();
            }
        });
        msgBox.show();
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