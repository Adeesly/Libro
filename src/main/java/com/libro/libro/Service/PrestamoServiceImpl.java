package com.libro.libro.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libro.libro.Entity.Prestamo;
import com.libro.libro.Repository.PrestamoRepository;

@Service
public class PrestamoServiceImpl implements PrestamoService{

    @Autowired
    private PrestamoRepository prestamoRepository;

    @Override
    public List<Prestamo> listarPrestamo() {
        return prestamoRepository.findAll();
    }

    @Override
    public Optional<Prestamo> obtenerPrestamoPorID(Long id_prestamo) {
        return prestamoRepository.findById(id_prestamo);
    }

    @Override
    public Prestamo actualizarPrestamo(Prestamo prestamo) {
       return prestamoRepository.save(prestamo);
    }

    @Override
    public Prestamo agregarPrestamo(Prestamo prestamo) {
       return prestamoRepository.save(prestamo);
    }

    @Override
    public void eliminarPrestamo(Long id_prestamo) {
       prestamoRepository.deleteById(id_prestamo);
    }

}
