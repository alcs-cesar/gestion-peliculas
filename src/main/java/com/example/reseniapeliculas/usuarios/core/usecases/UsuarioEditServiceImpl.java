package com.example.reseniapeliculas.usuarios.core.usecases;

import com.example.reseniapeliculas.usuarios.core.boundary.enter.UsuarioEditService;
import com.example.reseniapeliculas.usuarios.core.boundary.exit.UsuarioEditRepository;
import com.example.reseniapeliculas.usuarios.core.domain.Usuario;

public class UsuarioEditServiceImpl implements UsuarioEditService {

    private final UsuarioEditRepository usuarioEditRepository;

    public UsuarioEditServiceImpl(UsuarioEditRepository usuarioEditRepository) {
        this.usuarioEditRepository = usuarioEditRepository;
    }

    @Override
    public void crear(Usuario usuario) {
        usuarioEditRepository.crear(usuario);
    }
}
