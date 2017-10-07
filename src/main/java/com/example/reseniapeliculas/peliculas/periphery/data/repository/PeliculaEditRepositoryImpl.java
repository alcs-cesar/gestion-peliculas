package com.example.reseniapeliculas.peliculas.periphery.data.repository;

import com.example.reseniapeliculas.peliculas.core.boundary.exit.PeliculaEditRepository;
import com.example.reseniapeliculas.peliculas.core.domain.Pelicula;
import com.example.reseniapeliculas.peliculas.periphery.data.jpa.PeliculaJpaRepository;
import com.example.reseniapeliculas.peliculas.periphery.data.jpa.entities.PeliculaEntity;
import com.example.reseniapeliculas.peliculas.periphery.data.jpa.entities.builders.PeliculaEntityBuilder;

public class PeliculaEditRepositoryImpl implements PeliculaEditRepository {

    private final PeliculaJpaRepository peliculaJpaRepository;

    public PeliculaEditRepositoryImpl(PeliculaJpaRepository peliculaJpaRepository) {
        this.peliculaJpaRepository = peliculaJpaRepository;
    }

    @Override
    public void crear(Pelicula pelicula) {
        PeliculaEntity peliculaEntity = toEntity(pelicula);
        peliculaJpaRepository.save(peliculaEntity);
    }

    private PeliculaEntity toEntity(Pelicula pelicula) {
        PeliculaEntity peliculaEntity =
                PeliculaEntityBuilder.getBuilder()
                        .titulo( pelicula.getTitulo() )
                        .resenia( pelicula.getResenia() )
                        .sinopsis( pelicula.getSinopsis() )
                        .fechaEstreno( pelicula.getFechaEstreno() )
                        .poster( pelicula.getPoster() )
                        .build();

        return peliculaEntity;
    }
}
