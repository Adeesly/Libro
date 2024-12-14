package com.libro.libro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.libro.libro.Entity.Libro;

public interface LibroRepository extends JpaRepository<Libro, Long> {
}