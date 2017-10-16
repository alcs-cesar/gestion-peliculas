package com.example.reseniapeliculas.usuarios.adapter.web.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UsuarioDto {

    private long id;
    private NombreCompletoDto nombreCompleto;
    private String correo;
    private String contrasenia;

    public UsuarioDto() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public NombreCompletoDto getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(NombreCompletoDto nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
}
