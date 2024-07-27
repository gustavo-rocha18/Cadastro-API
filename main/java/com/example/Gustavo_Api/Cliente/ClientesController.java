package com.example.Gustavo_Api.Cliente;

import com.example.Gustavo_Api.Repository.ClienteRepository;
import com.example.Gustavo_Api.cliente.Cliente;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClientesController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("/listar")
    public List<Cliente> Listar(){
        return clienteRepository.findAll();
    }


    @PostMapping("/adicionar")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente Adicionar(@Valid @RequestBody Cliente cliente){
        return clienteRepository.save(cliente);
    }
}
