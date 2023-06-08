package com.backend_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend_project.model.PagamentoModel;

@Repository
public interface PagamentoRepository extends JpaRepository<PagamentoModel, Long>{

}
