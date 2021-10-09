package com.LojasKlm.repositores;

import org.springframework.data.repository.CrudRepository;

import com.LojasKlm.models.Convidado;
import com.LojasKlm.models.Evento;

public interface ConvidadoRepository extends CrudRepository<Convidado, String> {
   Iterable<Convidado> findByEvento(Evento evento);
}
