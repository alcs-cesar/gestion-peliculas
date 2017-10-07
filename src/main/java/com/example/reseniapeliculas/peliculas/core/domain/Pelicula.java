package com.example.reseniapeliculas.peliculas.core.domain;

import com.example.reseniapeliculas.common.utils.ArchivoBinario;
import com.example.reseniapeliculas.common.utils.Fecha;

public class Pelicula {
    private String titulo;
    private String sinopsis;
    private ArchivoBinario poster;
    private String resenia;
    private Fecha fechaEstreno;

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

    public ArchivoBinario getPoster() {
        return poster;
    }

    public void setPoster(ArchivoBinario poster) {
        this.poster = poster;
    }

    public String getResenia() {
        return resenia;
    }

    public void setResenia(String resenia) {
        this.resenia = resenia;
    }

    public Fecha getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(Fecha fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }
}
