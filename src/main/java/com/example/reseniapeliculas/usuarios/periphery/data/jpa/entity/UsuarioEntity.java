package com.example.reseniapeliculas.usuarios.periphery.data.jpa.entity;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Usuario")
public class UsuarioEntity {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Embedded
    private NombreCompleto nombreCompleto;

    private String correo;
    private String password;

    protected UsuarioEntity() {
    }

    private UsuarioEntity(long id, NombreCompleto nombreCompleto, String correo, String password) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.correo = correo;
        this.password = password;
    }

    public static UsuarioEntity of(long id, NombreCompleto nombreCompleto, String correo, String password) {
        return new UsuarioEntity(id, nombreCompleto, correo, password);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public NombreCompleto getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(NombreCompleto nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsuarioEntity that = (UsuarioEntity) o;

        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombreCompleto);
    }
}
