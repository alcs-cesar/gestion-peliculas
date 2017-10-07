package com.example.reseniapeliculas.peliculas.adapter.api;

import com.example.reseniapeliculas.common.utils.ArchivoBinario;

public class PosterDto {
    private ArchivoBinario binario;

    public static PosterDto of(ArchivoBinario archivoBinario) {
        PosterDto posterDto = new PosterDto();
        posterDto.setBinario(archivoBinario);

        return posterDto;
    }

    public static PosterDto of(byte[] bytesArchivoBinario) {
        ArchivoBinario archivoBinario = ArchivoBinario.of(bytesArchivoBinario);
        return of(archivoBinario);
    }

    public ArchivoBinario getBinario() {
        return binario;
    }

    public void setBinario(ArchivoBinario binario) {
        this.binario = binario;
    }
}
