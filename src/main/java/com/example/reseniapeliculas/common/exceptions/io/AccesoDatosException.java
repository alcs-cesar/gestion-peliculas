package com.example.reseniapeliculas.common.exceptions.io;

import com.example.reseniapeliculas.common.exceptions.GestionPeliculasException;

public class AccesoDatosException extends GestionPeliculasException{
    public AccesoDatosException() {
        super();
    }

    public AccesoDatosException(String message) {
        super(message);
    }

    public AccesoDatosException(String message, Throwable cause) {
        super(message, cause);
    }

    public AccesoDatosException(Throwable cause) {
        super(cause);
    }
}
