package com.example.reseniapeliculas.peliculas.adapter.web.configuration;

import com.example.reseniapeliculas.peliculas.adapter.web.PeliculaAdapter;
import com.example.reseniapeliculas.peliculas.core.boundary.enter.PeliculaEditUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AdapterWiringConfiguration {

    @Bean
    public PeliculaAdapter peliculaAdapter(PeliculaEditUseCase peliculaEditUseCase) {
        return new PeliculaAdapter(peliculaEditUseCase);
    }
}
