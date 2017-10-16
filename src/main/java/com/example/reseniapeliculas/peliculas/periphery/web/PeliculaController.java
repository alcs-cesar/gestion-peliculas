package com.example.reseniapeliculas.peliculas.periphery.web;

import com.example.reseniapeliculas.common.exceptions.io.AccesoDatosException;
import com.example.reseniapeliculas.common.utils.ArchivoBinario;
import com.example.reseniapeliculas.peliculas.adapter.web.PeliculaAdapter;
import com.example.reseniapeliculas.peliculas.adapter.web.api.NuevaPeliculaDto;
import com.example.reseniapeliculas.peliculas.adapter.web.api.PosterDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

//TODO:Return RESTful URLs
@RestController
@RequestMapping("api/peliculas")
public class PeliculaController {

    private final PeliculaAdapter peliculaAdapter;

    @Autowired
    public PeliculaController(PeliculaAdapter peliculaAdapter) {
        this.peliculaAdapter = peliculaAdapter;
    }


    //TODO:Validaciones
    @RequestMapping(method = RequestMethod.POST, value = "")
    public void crear(@RequestPart("poster") MultipartFile imagenPoster,
                      @RequestPart("nuevaPelicula") NuevaPeliculaDto nuevaPeliculaDto) {

        nuevaPeliculaDto = addImagenPoster(nuevaPeliculaDto, imagenPoster);

        peliculaAdapter.crear( nuevaPeliculaDto );
    }

    //TODO: Write to FS or another place and later get back the file
    private NuevaPeliculaDto addImagenPoster(NuevaPeliculaDto nuevaPeliculaDto, MultipartFile imagenPoster) {
        PosterDto posterDto = PosterDto.of( getArchivoBinario(imagenPoster) );
        nuevaPeliculaDto.setPosterDto(posterDto);

        return nuevaPeliculaDto;
    }

    //TODO: Review the exception handling
    private ArchivoBinario getArchivoBinario(MultipartFile multipartFile) {
        try {
            return ArchivoBinario.of( multipartFile.getBytes() );
        } catch (IOException e) {
            throw new AccesoDatosException(e);
        }
    }


}
