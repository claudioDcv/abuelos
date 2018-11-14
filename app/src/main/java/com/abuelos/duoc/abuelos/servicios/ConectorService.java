package com.abuelos.duoc.abuelos.servicios;

import com.abuelos.duoc.abuelos.modelos.Login;
import com.abuelos.duoc.abuelos.dto.LoginRequestDto;
import com.abuelos.duoc.abuelos.modelos.Medicamento;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ConectorService {
    @GET("medicamentos")
    Call<List<Medicamento>> listadoDeMedicamentos();

    @POST("login")
    Call<Login> login(@Body LoginRequestDto loginRequestDto);
}
