package com.example.aluracursos.desafio.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)

//obtenemos toda la lista en json de los librios y la guardamos en una lista

public record Datos(
        @JsonAlias("results") List<DatosLibros> resultados
) {
}
