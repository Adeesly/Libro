package com.libro.libro.Entity;

import lombok.Data;

@Data
public class LibroDTO {
    private String nombre;
    private String genero;
    private String descripcion;
    private String image;
    private String autor;
}
