package com.api.agendamento.service;

import com.api.agendamento.model.Exames;
import com.api.agendamento.repositories.ExamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExamesService {
    @Autowired
   static ExamesRepository examesRepository;
    public static Exames save(Exames exames){
        return examesRepository.save(exames);
    }
}
