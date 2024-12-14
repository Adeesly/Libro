package com.libro.libro.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.libro.libro.Entity.Prestamo;

@Service
public interface PrestamoService {
        List<Prestamo> listarPrestamo();

        Optional<Prestamo> obtenerPrestamoPorID(Long id_prestamo);

        Prestamo actualizarPrestamo(Prestamo prestamo);

        Prestamo agregarPrestamo(Prestamo prestamo);

        void eliminarPrestamo(Long id_prestamo);

}
