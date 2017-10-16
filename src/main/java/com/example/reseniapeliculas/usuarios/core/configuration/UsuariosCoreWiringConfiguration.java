package com.example.reseniapeliculas.usuarios.core.configuration;

import com.example.reseniapeliculas.usuarios.core.boundary.enter.UsuarioEditService;
import com.example.reseniapeliculas.usuarios.core.boundary.exit.UsuarioEditRepository;
import com.example.reseniapeliculas.usuarios.core.usecases.UsuarioEditServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UsuariosCoreWiringConfiguration {

    @Bean
    public UsuarioEditService usuarioEditService(UsuarioEditRepository usuarioEditRepository) {
        return new UsuarioEditServiceImpl(usuarioEditRepository);
    }
}
