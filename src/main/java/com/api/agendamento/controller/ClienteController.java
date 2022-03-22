package com.api.agendamento.controller;

import com.api.agendamento.dto.ClienteDto;
import com.api.agendamento.model.Cliente;
import com.api.agendamento.repositories.ClienteRepository;
import com.api.agendamento.service.ClienteService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/agendamento-cliente")
public class ClienteController {
    @Autowired
    ClienteService clienteService;
    @Autowired
    ClienteRepository clienteRepository;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente adicionarCliente(@Validated @RequestBody ClienteDto cliente) {
        Cliente clienteModel=new Cliente();
        BeanUtils.copyProperties(cliente,clienteModel);
        return clienteRepository.save(clienteModel);
    }
    }


















