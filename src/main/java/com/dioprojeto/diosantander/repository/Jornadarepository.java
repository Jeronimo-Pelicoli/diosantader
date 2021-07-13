package com.dioprojeto.diosantander.repository;

import com.dioprojeto.diosantander.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Jornadarepository extends JpaRepository<JornadaTrabalho, Long> {
}
