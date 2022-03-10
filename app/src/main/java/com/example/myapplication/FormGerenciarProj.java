package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class FormGerenciarProj extends AppCompatActivity {

    Spinner TipoAprovacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_gerenciar_proj);
        getSupportActionBar().hide();


        TipoAprovacao = (Spinner) findViewById(R.id.spinnerTipo_Aprv);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.TipoAprov,
                android.R.layout.simple_spinner_item);
        TipoAprovacao.setAdapter(adapter);

        findViewById(R.id.bt_AddProj).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exibirConfirmacao();
            }
        });
    }

    public void exibirConfirmacao() {

        AlertDialog.Builder msgBox = new AlertDialog.Builder(this);
        msgBox.setTitle("Criando Projeto...");
        msgBox.setIcon(android.R.drawable.ic_menu_save);
        msgBox.setMessage("Deseja criar Pojeto?");
        msgBox.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int witch) {
                Toast.makeText(FormGerenciarProj.this, "Projeto Criado",
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(FormGerenciarProj.this,
                        FormBemVindoAdm.class);
                startActivity(intent);
            }
        });
        msgBox.setNegativeButton("Nao", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(FormGerenciarProj.this, "Cancelado",
                        Toast.LENGTH_SHORT).show();
            }
        });
        msgBox.show();
    }
}