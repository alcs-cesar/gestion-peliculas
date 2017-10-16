package com.example.reseniapeliculas.usuarios.periphery.data.configuration;

import com.example.reseniapeliculas.usuarios.core.boundary.exit.UsuarioEditRepository;
import com.example.reseniapeliculas.usuarios.periphery.data.jpa.repository.UsuarioJpaRepository;
import com.example.reseniapeliculas.usuarios.periphery.data.repository.UsuarioEditRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UsuariosDataWiringConfiguration {

    @Bean
    public UsuarioEditRepository usuarioEditRepository(UsuarioJpaRepository usuarioJpaRepository) {
        return new UsuarioEditRepositoryImpl(usuarioJpaRepository);
    }

}
