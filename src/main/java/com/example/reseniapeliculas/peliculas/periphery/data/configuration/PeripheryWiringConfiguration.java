package com.example.reseniapeliculas.peliculas.periphery.data.configuration;

import com.example.reseniapeliculas.peliculas.core.boundary.exit.PeliculaEditRepository;
import com.example.reseniapeliculas.peliculas.periphery.data.jpa.PeliculaJpaRepository;
import com.example.reseniapeliculas.peliculas.periphery.data.repository.PeliculaEditRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PeripheryWiringConfiguration {

    @Bean
    public PeliculaEditRepository peliculaEditRepository(PeliculaJpaRepository peliculaJpaRepository) {
        return new PeliculaEditRepositoryImpl(peliculaJpaRepository);
    }
}
