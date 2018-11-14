package com.abuelos.duoc.abuelos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Medicamentos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicamentos);
    }

    public void abrirExamenes(View view) {
        Intent intent = new Intent(this, Examenes.class);
        startActivity(intent);
    }

    public void abrirAgregarMedicamento(View view) {
        Intent intent = new Intent(this, AgregarMedicamento.class);
        startActivity(intent);
    }
}
