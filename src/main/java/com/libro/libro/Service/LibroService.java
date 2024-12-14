package com.libro.libro.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.libro.libro.Entity.Libro;

@Service
public interface LibroService {
        List<Libro> listarLibros();

        Optional<Libro> obtenerLibroPorCodigo(Long codigo);

        Libro actualizarLibro(Libro libro);

        Libro agregarLibro(Libro libro);

        void eliminarLibro(Long codigo);
}
