package com.example.reseniapeliculas.common.utils;

public class ArchivoBinario {
    private byte[] binario;

    public static ArchivoBinario of(byte[] binario) {
        ArchivoBinario archivoBinario = new ArchivoBinario();
        archivoBinario.setBinario(binario);

        return archivoBinario;
    }

    public byte[] getBinario() {
        return binario;
    }

    public void setBinario(byte[] binario) {
        this.binario = binario;
    }
}
