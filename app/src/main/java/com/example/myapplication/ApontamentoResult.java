package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.model.CEP;
import com.example.myapplication.service.HTTPService;

import java.util.concurrent.ExecutionException;

public class ApontamentoResult extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apontamento_result);
        getSupportActionBar().hide();

        final EditText etCep = findViewById(R.id.edt_Cep);
        final TextView tvResposta = findViewById(R.id.txv_resultado);

        Button botao = findViewById(R.id.bt_buscarCep);
        botao.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (etCep.getText().toString().length() > 0 ) {
                     HTTPService service = new HTTPService(etCep.getText().toString());
                    try {
                        CEP retorno = service.execute().get();
                        tvResposta.setText(retorno.toString());
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }
}