package com.libro.libro.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.libro.libro.Entity.Cliente;


@Service
public interface ClienteService {

    List<Cliente>listarClientes();

    Optional<Cliente> obtenerClientePorID(Long id_cliente);

    Cliente actualizarCliente(Cliente cliente);

    Cliente agregarCliente(Cliente Cliente);

    void eliminarCliente(Long id_cliente);

}
