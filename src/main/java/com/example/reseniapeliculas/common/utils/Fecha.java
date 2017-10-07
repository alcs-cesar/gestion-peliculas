package com.example.reseniapeliculas.common.utils;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Fecha {

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date fecha;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
