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

import com.libro.libro.Entity.Prestamo;
import com.libro.libro.Service.PrestamoService;

@RestController
@RequestMapping("/api/prestamo")
public class PrestamoController {

    @Autowired
    private PrestamoService prestamoService;

     @GetMapping("/lista")
    public List<Prestamo> listarPrestamo() {
        return prestamoService.listarPrestamo();
    }

    @GetMapping("/{codigo}")
    public Optional<Prestamo> obtenerPrestamoPorID(@PathVariable Long id_prestamo) {
        return prestamoService.obtenerPrestamoPorID(id_prestamo);
    }

    @PostMapping("/registrar")
    public Prestamo registrarPrestamo(@RequestBody Prestamo prestamo) {

        Prestamo prestamo1 = new Prestamo();
        prestamo1.setId_libro(prestamo.getId_libro());
        prestamo1.setId_cliente(prestamo.getId_cliente());
        prestamo1.setFecha_prestamo(prestamo.getFecha_prestamo());
        prestamo1.setFecha_devolucion(prestamo.getFecha_devolucion());
        prestamo1.setEstado(prestamo.getEstado());

        return prestamoService.agregarPrestamo(prestamo1);
    }

    @PutMapping("/actualizar")
    public Prestamo actualizarPrestamo(@PathVariable Long id_prestamo, @RequestBody Prestamo prestamo) {

        Prestamo prestamo1 = new Prestamo();
        prestamo1.setId_libro(prestamo.getId_libro());
        prestamo1.setId_cliente(prestamo.getId_cliente());
        prestamo1.setFecha_prestamo(prestamo.getFecha_prestamo());
        prestamo1.setFecha_devolucion(prestamo.getFecha_devolucion());
        prestamo1.setEstado(prestamo.getEstado());

        return prestamoService.agregarPrestamo(prestamo1);
    }

    @DeleteMapping("/eliminar")
    public void eliminarPrestamo(@PathVariable Long id_prestamo) {
        prestamoService.eliminarPrestamo(id_prestamo);
    }
}
