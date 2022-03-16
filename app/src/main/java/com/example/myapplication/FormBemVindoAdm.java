package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

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
                Toast.makeText(FormBemVindoAdm.this, "LogOff",
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(FormBemVindoAdm.this,
                        AppBreis.class);
                startActivity(intent);
            }
        });
        msgBox.setNegativeButton("Nao", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(FormBemVindoAdm.this, "Cancelado",
                        Toast.LENGTH_SHORT).show();
            }
        });
        msgBox.show();
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