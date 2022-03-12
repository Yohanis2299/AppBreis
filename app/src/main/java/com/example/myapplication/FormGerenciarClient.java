package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class FormGerenciarClient extends AppCompatActivity {

    ImageButton androidImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_gerenciar_client);
        getSupportActionBar().hide();

        findViewById(R.id.bt_AddCLient).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exibirConfirmacao();
            }
        });
        androidImageButton= (ImageButton) findViewById(R.id.bt_backpage);
        androidImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBackPage();
            }
        });
    }
    public void exibirConfirmacao() {

        AlertDialog.Builder msgBox = new AlertDialog.Builder(this);
        msgBox.setTitle("Adicionando Cliente...");
        msgBox.setIcon(android.R.drawable.ic_menu_save);
        msgBox.setMessage("Deseja adicionar CLiente?");
        msgBox.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int witch) {
                Toast.makeText(FormGerenciarClient.this, "Cliente Adicionado",
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(FormGerenciarClient.this,
                        FormBemVindoAdm.class);
                startActivity(intent);
            }
        });
        msgBox.setNegativeButton("Nao", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(FormGerenciarClient.this, "Cancelado",
                        Toast.LENGTH_SHORT).show();
            }
        });
        msgBox.show();
    }
    private void openBackPage(){
        Intent intent =  new Intent(FormGerenciarClient.this, FormBemVindoAdm.class);
        startActivity(intent);
    }
}