package com.libro.libro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.libro.libro.Entity.Cliente;

public interface ClienteRepository extends JpaRepository <Cliente, Long> {

   

}
