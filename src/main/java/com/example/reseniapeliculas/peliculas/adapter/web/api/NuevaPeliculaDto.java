package com.example.reseniapeliculas.peliculas.adapter.web.api;

public class NuevaPeliculaDto extends BasePeliculaDto {
    private PosterDto posterDto;

    public PosterDto getPosterDto() {
        return posterDto;
    }

    public void setPosterDto(PosterDto posterDto) {
        this.posterDto = posterDto;
    }
}
