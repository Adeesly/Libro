package com.libro.libro.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libro.libro.Entity.Libro;
import com.libro.libro.Repository.LibroRepository;

@Service
public class LibroServiceImpl implements LibroService {

    @Autowired
    private LibroRepository libroRepository;

    @Override
    public List<Libro> listarLibros() {
        return libroRepository.findAll();
    }

    @Override
    public Optional<Libro> obtenerLibroPorCodigo(Long codigo) {
        return libroRepository.findById(codigo);
    }

    @Override
    public Libro actualizarLibro(Libro libro) {
        return libroRepository.save(libro); 
    }

    @Override
    public Libro agregarLibro(Libro libro) {
        return libroRepository.save(libro);
    }

    @Override
    public void eliminarLibro(Long codigo) {
        libroRepository.deleteById(codigo);
    }
}
