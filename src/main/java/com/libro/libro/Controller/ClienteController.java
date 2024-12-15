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

import com.libro.libro.Entity.Cliente;
import com.libro.libro.Service.ClienteService;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

     @GetMapping("/lista")
    public List<Cliente> listarClientes() {
        return clienteService.listarClientes();
    }

    @GetMapping("/{id_cliente}")
    public Optional<Cliente> obtenerClientePorID(@PathVariable Long id_cliente) {
        return clienteService.obtenerClientePorID(id_cliente);
    }

    @PostMapping("/registrar")
    public Cliente registrarCliente(@RequestBody Cliente cliente) {

        Cliente cliente1 = new Cliente();
        cliente1.setNombre(cliente.getNombre());
        cliente1.setApellidos(cliente.getApellidos());
        cliente1.setDni(cliente.getDni());
        cliente1.setCorreo(cliente.getCorreo());

        return clienteService.agregarCliente(cliente1);
    }


    @PutMapping("/actualizar/{id_cliente}")
    public Cliente actualizarCliente(@PathVariable Long id_cliente, @RequestBody Cliente cliente) {

        Cliente cliente1 = new Cliente();
        cliente1.setId_cliente(id_cliente);
        cliente1.setNombre(cliente.getNombre());
        cliente1.setApellidos(cliente.getApellidos());
        cliente1.setDni(cliente.getDni());
        cliente1.setCorreo(cliente.getCorreo());

        return clienteService.agregarCliente(cliente1);
    }

    @DeleteMapping("/eliminar/{id_cliente}")
    public void eliminarCliente(@PathVariable Long id_cliente) {
        clienteService.eliminarCliente(id_cliente);
    }

}
