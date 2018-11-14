package com.abuelos.duoc.abuelos.modelos;

public class Login {
    String status;

    public Login(String status) {
        this.status = status;
    }

    public Login() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
