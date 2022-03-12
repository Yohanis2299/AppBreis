package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class FormGerenciarUser extends AppCompatActivity {

    Spinner TipoContrato;
    Spinner TipoCargo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_gerenciar_user);
        getSupportActionBar().hide();

        TipoCargo = (Spinner) findViewById(R.id.spinnerCargo);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(FormGerenciarUser.this, R.array.Cargos,
                android.R.layout.simple_spinner_item);
        TipoCargo.setAdapter(adapter);

        TipoContrato = (Spinner) findViewById(R.id.spinnerContrato);

        ArrayAdapter adapter2 = ArrayAdapter.createFromResource(FormGerenciarUser.this, R.array.Contratos,
                android.R.layout.simple_spinner_item);
        TipoContrato.setAdapter(adapter2);

    }
}
