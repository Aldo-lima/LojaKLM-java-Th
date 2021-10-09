package com.LojasKlm.repositores;

import org.springframework.data.repository.CrudRepository;

import com.LojasKlm.models.Evento;

public interface EventoRepository extends CrudRepository< Evento, String> {
      Evento findByCodigo(long codigo);
}
