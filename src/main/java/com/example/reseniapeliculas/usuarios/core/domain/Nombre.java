package com.example.reseniapeliculas.usuarios.core.domain;

import org.immutables.value.Value;

@Value.Immutable
public interface Nombre {

    @Value.Parameter
    String value();
}
