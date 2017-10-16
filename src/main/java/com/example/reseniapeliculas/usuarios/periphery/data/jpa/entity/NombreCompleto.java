package com.example.reseniapeliculas.usuarios.periphery.data.jpa.entity;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class NombreCompleto {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;

    protected NombreCompleto() {}

    private NombreCompleto(String nombre, String apellidoPaterno, String apellidoMaterno) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }

    public static NombreCompleto create(String nombre, String apellidoPaterno, String apellidoMaterno) {
        return new NombreCompleto(nombre, apellidoPaterno, apellidoMaterno);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NombreCompleto that = (NombreCompleto) o;

        if (!nombre.equals(that.nombre)) return false;
        if (!apellidoPaterno.equals(that.apellidoPaterno)) return false;
        return apellidoMaterno.equals(that.apellidoMaterno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellidoPaterno, apellidoMaterno);
    }
}
