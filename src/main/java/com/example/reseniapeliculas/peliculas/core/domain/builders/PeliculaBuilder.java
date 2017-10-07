package com.example.reseniapeliculas.peliculas.core.domain.builders;

import com.example.reseniapeliculas.peliculas.core.domain.Pelicula;
import com.example.reseniapeliculas.common.utils.ArchivoBinario;
import com.example.reseniapeliculas.common.utils.Fecha;

public class PeliculaBuilder {

    private Pelicula pelicula;

    private PeliculaBuilder() {
        pelicula = new Pelicula();
    }

    public static PeliculaBuilder getBuilder() {
        return new PeliculaBuilder();
    }

    public Pelicula build() {
        return pelicula;
    }

    public PeliculaBuilder titulo(String titulo) {
        pelicula.setTitulo(titulo);
        return this;
    }

    public PeliculaBuilder sinopsis(String sinopsis) {
        pelicula.setSinopsis(sinopsis);
        return this;
    }

    public PeliculaBuilder poster(ArchivoBinario archivoBinario) {
        pelicula.setPoster(archivoBinario);
        return this;
    }

    public PeliculaBuilder resenia(String resenia) {
        pelicula.setResenia(resenia);
        return this;
    }

    public PeliculaBuilder fechaEstreno(Fecha fecha) {
        pelicula.setFechaEstreno( fecha );
        return this;
    }

}
