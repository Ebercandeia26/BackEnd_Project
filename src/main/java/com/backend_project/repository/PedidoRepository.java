package com.backend_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.backend_project.model.PedidoModel;

@Repository
public interface PedidoRepository extends JpaRepository<PedidoModel, Long>{

}
