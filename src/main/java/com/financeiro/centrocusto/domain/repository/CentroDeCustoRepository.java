package com.financeiro.centrocusto.domain.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.financeiro.centrocusto.domain.model.CentroDeCusto;
import com.financeiro.centrocusto.domain.model.Usuario;

public interface CentroDeCustoRepository extends JpaRepository<CentroDeCusto, Long> {
    
    List<CentroDeCusto> findByUsuario(Usuario usuario);
}