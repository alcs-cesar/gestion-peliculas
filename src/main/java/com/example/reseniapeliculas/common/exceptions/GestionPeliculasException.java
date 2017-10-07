package com.example.reseniapeliculas.common.exceptions;

public class GestionPeliculasException extends RuntimeException {

    public GestionPeliculasException() {
        super();
    }

    public GestionPeliculasException(String message) {
        super(message);
    }

    public GestionPeliculasException(String message, Throwable cause) {
        super(message, cause);
    }

    public GestionPeliculasException(Throwable cause) {
        super(cause);
    }
}
