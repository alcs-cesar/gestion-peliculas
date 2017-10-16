package com.example.reseniapeliculas.usuarios.adapter.web;


import com.example.reseniapeliculas.usuarios.adapter.web.api.NombreCompletoDto;
import com.example.reseniapeliculas.usuarios.adapter.web.api.UsuarioDto;
import com.example.reseniapeliculas.usuarios.core.domain.*;

public class UsuarioFactory {
    private UsuarioFactory() {
    }

    public static Usuario usuario(UsuarioDto usuarioDto) {
        Usuario.Id id = Usuario.Id.of( usuarioDto.getId() );
        NombreCompleto nombreCompleto = getNombreCompleto( usuarioDto.getNombreCompleto());
        Email email = ImmutableEmail.of( usuarioDto.getCorreo() );
        Contrasenia contrasenia = ImmutableContrasenia.of( usuarioDto.getContrasenia() );

        //TODO: Refactor to Builder (what happens when i want to add a parameter)
        Usuario usuario =
                Usuario.of(
                        id,
                        nombreCompleto,
                        email,
                        contrasenia
                );

        return usuario;
    }

    private static NombreCompleto getNombreCompleto(NombreCompletoDto nombreCompletoDto) {
        String nombre = nombreCompletoDto.getNombre();
        String apellidoPaterno = nombreCompletoDto.getApellidoPaterno();
        String apellidoMaterno = nombreCompletoDto.getApellidoMaterno();

        NombreCompleto nombreCompleto =
                ImmutableNombreCompleto.builder()
                        .nombre( ImmutableNombre.of(nombre) )
                        .apellidoPaterno( ImmutableApellidoPaterno.of(apellidoPaterno) )
                        .apellidoMaterno( ImmutableApellidoMaterno.of(apellidoMaterno) )
                        .build();

        return nombreCompleto;
    }


}
