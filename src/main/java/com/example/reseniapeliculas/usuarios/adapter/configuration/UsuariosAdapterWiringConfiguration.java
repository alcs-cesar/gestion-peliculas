package com.example.reseniapeliculas.usuarios.adapter.configuration;

import com.example.reseniapeliculas.usuarios.adapter.web.UsuarioAdapter;
import com.example.reseniapeliculas.usuarios.core.boundary.enter.UsuarioEditService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UsuariosAdapterWiringConfiguration {

    @Bean
    public UsuarioAdapter usuarioAdapter(UsuarioEditService usuarioEditService) {
        return new UsuarioAdapter(usuarioEditService);
    }
}
