package com.facens.controltech_mobile_01.modelos;

public class Usuario {
    private String nome;
    private String user_password;
    private String email;


    public Usuario() {
    }

    public Usuario(String nome, String user_password, String email) {
        this.nome = nome;
        this.user_password = user_password;
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getUser_password() {
        return user_password;
    }

    public String getEmail() {
        return email;
    }
}
