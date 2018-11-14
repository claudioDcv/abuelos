package com.abuelos.duoc.abuelos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Examenes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_examenes);
    }

    public void abrirMedicamentos(View view) {
        Intent intent = new Intent(this, Medicamentos.class);
        startActivity(intent);
    }

    public void agregarExamenYVolverAExamenes(View view) {
        Intent intent = new Intent(this, AgregarExamen.class);
        startActivity(intent);
    }
}
