package com.abuelos.duoc.abuelos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AgregarMedicamento extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_medicamento);
    }

    public void programarYVolverAListado(View view) {
        Intent intent = new Intent(this, Medicamentos.class);
        startActivity(intent);
    }
}
