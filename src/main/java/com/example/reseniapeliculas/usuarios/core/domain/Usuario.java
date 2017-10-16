package com.example.reseniapeliculas.usuarios.core.domain;

import java.util.Objects;

public class Usuario {
    private Id id;
    private NombreCompleto nombreCompleto;
    private Email email;
    private Contrasenia contrasenia;

    private Usuario() {}

    private Usuario(Usuario.Id id, NombreCompleto nombreCompleto, Email email, Contrasenia contrasenia) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.contrasenia = contrasenia;
    }

    public static Usuario of(Usuario.Id id, NombreCompleto nombreCompleto, Email email, Contrasenia contrasenia) {
        return new Usuario(id, nombreCompleto, email, contrasenia);
    }

    public Id getId() {
        return id;
    }

    public NombreCompleto getNombreCompleto() {
        return nombreCompleto;
    }

    public Email getEmail() {
        return email;
    }

    public Contrasenia getContrasenia() {
        return contrasenia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Usuario usuario = (Usuario) o;

        return id.equals(usuario.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    public static class Id {
        private long id;

        private Id(long id) {
            this.id = id;
        }

        public static Id of(long id) {
            return new Id(id);
        }

        public long getId() {
            return id;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Id id1 = (Id) o;

            return id == id1.id;
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
    }
}
