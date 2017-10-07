package com.example.reseniapeliculas.peliculas.adapter;

import com.example.reseniapeliculas.peliculas.adapter.api.NuevaPeliculaDto;
import com.example.reseniapeliculas.peliculas.adapter.api.BasePeliculaDto;
import com.example.reseniapeliculas.peliculas.core.domain.Pelicula;
import com.example.reseniapeliculas.peliculas.core.domain.builders.PeliculaBuilder;
import com.example.reseniapeliculas.peliculas.core.boundary.enter.PeliculaEditUseCase;

public class PeliculaAdapter {

    private final PeliculaEditUseCase peliculaEditUseCase;

    public PeliculaAdapter(PeliculaEditUseCase peliculaEditUseCase) {
        this.peliculaEditUseCase = peliculaEditUseCase;
    }

    public void crear(NuevaPeliculaDto nuevaPeliculaDto) {
        Pelicula nuevaPelicula = toDomain( nuevaPeliculaDto );
        peliculaEditUseCase.crear( nuevaPelicula );
    }

    private Pelicula toDomain(NuevaPeliculaDto nuevaPeliculaDto) {
        Pelicula pelicula =
                PeliculaBuilder.getBuilder()
                .titulo( nuevaPeliculaDto.getTitulo() )
                .sinopsis( nuevaPeliculaDto.getSinopsis() )
                .poster( nuevaPeliculaDto.getPosterDto().getBinario() )
                .resenia( nuevaPeliculaDto.getResenia() )
                .fechaEstreno( nuevaPeliculaDto.getFechaEstreno() )
                .build();

        return pelicula;
    }
}
