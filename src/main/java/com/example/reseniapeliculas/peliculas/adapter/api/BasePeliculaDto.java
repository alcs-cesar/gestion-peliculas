package com.example.reseniapeliculas.peliculas.adapter.api;

import com.example.reseniapeliculas.common.utils.Fecha;

public class BasePeliculaDto {
    private Long id;
    private String titulo;
    private String sinopsis;
    //private PosterDto poster;
    private String resenia;
    private Fecha fechaEstreno;

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
