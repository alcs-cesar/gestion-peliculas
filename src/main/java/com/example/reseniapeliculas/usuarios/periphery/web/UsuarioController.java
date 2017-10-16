package com.example.reseniapeliculas.usuarios.periphery.web;

import com.example.reseniapeliculas.usuarios.adapter.web.UsuarioAdapter;
import com.example.reseniapeliculas.usuarios.adapter.web.api.UsuarioDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/usuarios")
public class UsuarioController {

    private final UsuarioAdapter usuarioAdapter;

    @Autowired
    public UsuarioController(UsuarioAdapter usuarioAdapter) {
        this.usuarioAdapter = usuarioAdapter;
    }

    @PostMapping("")
    public void crear(@RequestBody  UsuarioDto usuarioDto) {
        usuarioAdapter.crear(usuarioDto);
    }
}
