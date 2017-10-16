package com.example.reseniapeliculas.usuarios.periphery.data.jpa.repository;

import com.example.reseniapeliculas.usuarios.periphery.data.jpa.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioJpaRepository extends JpaRepository<UsuarioEntity, Long> {
}
