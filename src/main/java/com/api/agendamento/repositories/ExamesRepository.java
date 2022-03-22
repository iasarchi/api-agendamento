package com.api.agendamento.repositories;

import com.api.agendamento.model.Exames;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
    public interface ExamesRepository extends JpaRepository<Exames, UUID>{
}
