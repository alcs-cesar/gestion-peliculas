package com.example.reseniapeliculas.peliculas.periphery.data.jpa.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class PeliculaEntity {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titulo;
    private String sinopsis;
    @Lob
    private byte[] poster;
    private String resenia;

    @Temporal(TemporalType.DATE)
    private Date fechaEstreno;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public byte[] getPoster() {
        return poster;
    }

    public void setPoster(byte[] poster) {
        this.poster = poster;
    }

    public String getResenia() {
        return resenia;
    }

    public void setResenia(String resenia) {
        this.resenia = resenia;
    }

    public Date getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(Date fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }
}
