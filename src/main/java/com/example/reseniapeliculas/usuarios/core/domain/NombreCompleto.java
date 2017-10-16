package com.example.reseniapeliculas.usuarios.core.domain;

import org.immutables.value.Value;

@Value.Immutable
public interface NombreCompleto {
    Nombre nombre();
    ApellidoPaterno apellidoPaterno();
    ApellidoMaterno apellidoMaterno();
}
