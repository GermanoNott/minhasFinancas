package com.germano.minhasfinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.germano.minhasfinancas.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

}
