package com.example.reseniapeliculas.usuarios.periphery.data.repository;

import com.example.reseniapeliculas.usuarios.core.boundary.exit.UsuarioEditRepository;
import com.example.reseniapeliculas.usuarios.core.domain.Usuario;
import com.example.reseniapeliculas.usuarios.periphery.data.jpa.entity.NombreCompleto;
import com.example.reseniapeliculas.usuarios.periphery.data.jpa.entity.UsuarioEntity;
import com.example.reseniapeliculas.usuarios.periphery.data.jpa.repository.UsuarioJpaRepository;

public class UsuarioEditRepositoryImpl implements UsuarioEditRepository{

    private final UsuarioJpaRepository usuarioJpaRepository;

    public UsuarioEditRepositoryImpl(UsuarioJpaRepository usuarioJpaRepository) {
        this.usuarioJpaRepository = usuarioJpaRepository;
    }

    @Override
    public void crear(Usuario usuario) {
        UsuarioEntity usuarioEntity = usuarioEntity(usuario);
        usuarioJpaRepository.save(usuarioEntity);
    }

    private UsuarioEntity usuarioEntity(Usuario usuario) {
        NombreCompleto nombreCompleto = nombre( usuario.getNombreCompleto() );
        long id = usuario.getId().getId();
        String correo = usuario.getEmail().value();
        String password = usuario.getContrasenia().value();

        return UsuarioEntity.of (id, nombreCompleto, correo, password);

    }

    private NombreCompleto nombre(com.example.reseniapeliculas.usuarios.core.domain.NombreCompleto nombreCompleto) {
        String nombre = nombreCompleto.nombre().value();
        String apellidoPaterno = nombreCompleto.apellidoPaterno().value();
        String apellidoMaterno = nombreCompleto.apellidoMaterno().value();

        return NombreCompleto.create( nombre, apellidoPaterno, apellidoMaterno);
    }
}
