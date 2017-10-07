package com.example.reseniapeliculas.peliculas.periphery.data.jpa.entities.builders;

import com.example.reseniapeliculas.common.utils.ArchivoBinario;
import com.example.reseniapeliculas.common.utils.Fecha;
import com.example.reseniapeliculas.peliculas.core.domain.Pelicula;
import com.example.reseniapeliculas.peliculas.periphery.data.jpa.entities.PeliculaEntity;

public class PeliculaEntityBuilder {
    private PeliculaEntity peliculaEntity;

    private PeliculaEntityBuilder() {
        peliculaEntity = new PeliculaEntity();
    }

    public static PeliculaEntityBuilder getBuilder() {
        return new PeliculaEntityBuilder();
    }

    public PeliculaEntity build() {
        return peliculaEntity;
    }

    public PeliculaEntityBuilder id(Long id) {
        peliculaEntity.setId(id);
        return this;
    }

    public PeliculaEntityBuilder titulo(String titulo) {
        peliculaEntity.setTitulo(titulo);
        return this;
    }

    public PeliculaEntityBuilder sinopsis(String sinopsis) {
        peliculaEntity.setSinopsis(sinopsis);
        return this;
    }

    public PeliculaEntityBuilder poster(ArchivoBinario binario) {
        byte[] archivoBinario = null;

        if(binario != null && binario.getBinario() != null)
            archivoBinario = binario.getBinario();


        peliculaEntity.setPoster( archivoBinario );
        return this;
    }

    //asd
    public PeliculaEntityBuilder resenia(String resenia) {
        peliculaEntity.setResenia(resenia);
        return this;
    }

    public PeliculaEntityBuilder fechaEstreno(Fecha fechaEstreno) {
        peliculaEntity.setFechaEstreno( null );
        return this;
    }
}
