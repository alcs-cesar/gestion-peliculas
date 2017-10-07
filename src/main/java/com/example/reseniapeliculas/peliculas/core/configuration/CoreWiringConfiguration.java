package com.example.reseniapeliculas.peliculas.core.configuration;

import com.example.reseniapeliculas.peliculas.core.boundary.enter.PeliculaEditUseCase;
import com.example.reseniapeliculas.peliculas.core.boundary.exit.PeliculaEditRepository;
import com.example.reseniapeliculas.peliculas.core.usecases.PeliculaEditUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CoreWiringConfiguration {

    @Bean
    public PeliculaEditUseCase peliculaEditUseCase(PeliculaEditRepository peliculaEditRepository) {
        return new PeliculaEditUseCaseImpl(peliculaEditRepository);
    }
}
