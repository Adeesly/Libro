package com.libro.libro.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libro.libro.Entity.Libro;
import com.libro.libro.Entity.LibroDTO;
import com.libro.libro.Service.LibroService;

@RestController
@RequestMapping("/api/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping("/lista")
    public List<Libro> listarLibros() {
        return libroService.listarLibros();
    }

    @GetMapping("/{codigo}")
    public Optional<Libro> obtenerLibroPorCodigo(@PathVariable Long codigo) {
        return libroService.obtenerLibroPorCodigo(codigo);
    }

    @PostMapping("/registrar")
    public Libro registrarLibro(@RequestBody LibroDTO libroDTO) {

        Libro libro = new Libro();
        libro.setNombre(libroDTO.getNombre());
        libro.setGenero(libroDTO.getGenero());
        libro.setDescripcion(libroDTO.getDescripcion());
        libro.setImage(libroDTO.getImage());
        libro.setAutor(libroDTO.getAutor());

        return libroService.agregarLibro(libro);
    }

    @PutMapping("/{codigo}") 
    public Libro actualizarLibro(@PathVariable Long codigo, @RequestBody LibroDTO libroDTO) {
  
        Libro libro = new Libro();
        libro.setCodigo(codigo);
        libro.setNombre(libroDTO.getNombre());
        libro.setGenero(libroDTO.getGenero());
        libro.setDescripcion(libroDTO.getDescripcion());
        libro.setImage(libroDTO.getImage());
        libro.setAutor(libroDTO.getAutor());

        return libroService.actualizarLibro(libro);
    }

    @DeleteMapping("/{codigo}")
    public void eliminarLibro(@PathVariable Long codigo) {
        libroService.eliminarLibro(codigo);
    }
}
