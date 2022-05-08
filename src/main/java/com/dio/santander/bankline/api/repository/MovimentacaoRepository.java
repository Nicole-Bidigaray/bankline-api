package com.dio.santander.bankline.api.repository;

import com.dio.santander.bankline.api.model.Movimentacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer> {
}
