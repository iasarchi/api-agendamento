package com.api.agendamento.controller;

import com.api.agendamento.model.Cliente;
import com.api.agendamento.model.Exames;
import com.api.agendamento.repositories.ExamesRepository;
import com.api.agendamento.service.ExamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agendamento-exames")
public class ExamesController {
    @Autowired
    ExamesService examesService;
    @Autowired
    ExamesRepository examesRepository;

    @GetMapping
      public List<Exames> listaDeExames(@Validated Exames exames) {
       return examesRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Exames adicionarExames(@Validated @RequestBody Exames exames){
        return examesRepository.save(exames);
    }

}
