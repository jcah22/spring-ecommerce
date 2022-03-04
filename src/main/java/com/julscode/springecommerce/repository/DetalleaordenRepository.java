package com.julscode.springecommerce.repository;

import com.julscode.springecommerce.model.DetalleOrden;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleaordenRepository extends JpaRepository<DetalleOrden ,Integer> {
    
}
