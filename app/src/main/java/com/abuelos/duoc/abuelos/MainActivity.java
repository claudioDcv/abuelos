package com.abuelos.duoc.abuelos;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.abuelos.duoc.abuelos.modelos.Login;
import com.abuelos.duoc.abuelos.dto.LoginRequestDto;
import com.abuelos.duoc.abuelos.servicios.Conector;
import com.abuelos.duoc.abuelos.servicios.ConectorService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onLogin(View view) {

        EditText nombre = findViewById(R.id.text_nombre);
        EditText clave = findViewById(R.id.text_clave);

        String strNombre = nombre.getText().toString();
        String strClave = clave.getText().toString();

        Conector con = new Conector();
        ConectorService conectorService = con.getRetrofit().create(ConectorService.class);

        LoginRequestDto loginRequestDto = new LoginRequestDto(strNombre, strClave);

        Call<Login> loginCall = conectorService.login(loginRequestDto);



        loginCall.enqueue(new Callback<Login>() {
            @Override
            public void onResponse(Call<Login> call, Response<Login> response) {
                System.out.println(response.body());
                Intent intent = new Intent(MainActivity.this, Medicamentos.class);
                if (response.body().getStatus().equals("OK")) {
                    startActivity(intent);
                } else {
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("Error");
                    alertDialog.setMessage("Credenciales invalidas");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Cerrar",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();

                }

            }

            @Override
            public void onFailure(Call<Login> call, Throwable t) {

            }
        });

        // String message = editText.getText().toString();
        // intent.putExtra(EXTRA_MESSAGE, message);
        /*
        Conector con = new Conector();
        ConectorService conectorService = con.getRetrofit().create(ConectorService.class);
        Call<List<Medicamento>> listadoDeMedicamentos = conectorService.listadoDeMedicamentos();

        listadoDeMedicamentos.enqueue(new Callback<List<Medicamento>>() {
            @Override
            public void onResponse(Call<List<Medicamento>> call, Response<List<Medicamento>> response) {
                for (Medicamento m: response.body()) {
                    System.out.println(m.getNombre());
                }
            }

            @Override
            public void onFailure(Call<List<Medicamento>> call, Throwable t) {

            }
        });

        */


    }
}
