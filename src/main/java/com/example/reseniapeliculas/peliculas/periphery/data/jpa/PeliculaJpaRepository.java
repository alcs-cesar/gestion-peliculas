package com.example.reseniapeliculas.peliculas.periphery.data.jpa;

import com.example.reseniapeliculas.peliculas.periphery.data.jpa.entities.PeliculaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeliculaJpaRepository extends JpaRepository<PeliculaEntity, Long> {
}
