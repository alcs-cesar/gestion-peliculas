package com.example.reseniapeliculas.usuarios.adapter.web;

import com.example.reseniapeliculas.usuarios.adapter.web.api.UsuarioDto;
import com.example.reseniapeliculas.usuarios.core.boundary.enter.UsuarioEditService;
import com.example.reseniapeliculas.usuarios.core.domain.Usuario;

public class UsuarioAdapter {

    private final UsuarioEditService usuarioEditService;

    public UsuarioAdapter(UsuarioEditService usuarioEditService) {
        this.usuarioEditService = usuarioEditService;
    }

    public void crear(UsuarioDto usuarioDto) {
        //TODO: Validar datos del dto
        Usuario nuevoUsuario = UsuarioFactory.usuario(usuarioDto);
        usuarioEditService.crear(nuevoUsuario);
    }

}
