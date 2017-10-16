package com.example.reseniapeliculas.usuarios.core.domain;

import org.immutables.value.Value;

@Value.Immutable
public interface ApellidoMaterno {

    @Value.Parameter
    String value();
}
