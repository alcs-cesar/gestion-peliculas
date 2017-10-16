package com.example.reseniapeliculas.usuarios.core.domain;

import org.immutables.value.Value;

@Value.Immutable
public interface Contrasenia {

    @Value.Parameter
    String value();
}
