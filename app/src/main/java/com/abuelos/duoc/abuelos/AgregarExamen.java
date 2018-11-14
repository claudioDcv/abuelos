package com.abuelos.duoc.abuelos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AgregarExamen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_examen);
    }

    public void agendarExamenyVolverAExamenes(View view) {
        Intent intent = new Intent(this, Examenes.class);
        startActivity(intent);
    }
}
