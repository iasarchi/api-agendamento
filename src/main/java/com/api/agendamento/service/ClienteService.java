package com.api.agendamento.service;

import com.api.agendamento.model.Cliente;
import com.api.agendamento.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

   @Autowired
   static ClienteRepository clienteRepository;

public static Cliente save(Cliente cliente) {
   return clienteRepository.save(cliente);
}
}
