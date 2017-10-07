package com.example.reseniapeliculas.peliculas.core.usecases;

import com.example.reseniapeliculas.peliculas.core.boundary.enter.PeliculaEditUseCase;
import com.example.reseniapeliculas.peliculas.core.boundary.exit.PeliculaEditRepository;
import com.example.reseniapeliculas.peliculas.core.domain.Pelicula;

public class PeliculaEditUseCaseImpl implements PeliculaEditUseCase {

    private final PeliculaEditRepository peliculaEditRepository;

    public PeliculaEditUseCaseImpl(PeliculaEditRepository peliculaEditRepository) {
        this.peliculaEditRepository = peliculaEditRepository;
    }

    @Override
    public void crear(Pelicula pelicula) {
        peliculaEditRepository.crear(pelicula);
    }
}
