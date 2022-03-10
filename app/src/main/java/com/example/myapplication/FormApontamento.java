package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;


public class FormApontamento extends AppCompatActivity {

    ImageButton androidImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_apontamento);
        getSupportActionBar().hide();

        androidImageButton = (ImageButton) findViewById(R.id.imageButton5);
        androidImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backPage();
            }
        });
        findViewById(R.id.bt_addApont).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exibirConfirmacao();
            }
        });
    }
    public void exibirConfirmacao(){

        AlertDialog.Builder msgBox = new AlertDialog.Builder(this);
        msgBox.setTitle("Salvando Apontamento...");
        msgBox.setIcon(android.R.drawable.ic_menu_save);
        msgBox.setMessage("Deseja salvar esse apontamento?");
        msgBox.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int witch) {
                Toast.makeText(FormApontamento.this, "Apontamento Salvo",
                        Toast.LENGTH_SHORT).show();
                Intent intent =  new Intent(FormApontamento.this,
                        ListaApontamento.class);
                startActivity(intent);
            }
        });
        msgBox.setNegativeButton("Nao", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(FormApontamento.this, "Cancelado",
                        Toast.LENGTH_SHORT).show();
            }
        });
        msgBox.show();
    }
    private void backPage(){
        Intent intent =  new Intent(this, FormBemVindo.class);
        startActivity(intent);
    }
}