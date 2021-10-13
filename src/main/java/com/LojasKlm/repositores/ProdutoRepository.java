package com.LojasKlm.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LojasKlm.models.Produto;

public interface ProdutoRepository extends  JpaRepository< Produto, Integer> {
	
}
