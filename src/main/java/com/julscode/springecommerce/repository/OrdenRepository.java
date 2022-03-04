package com.julscode.springecommerce.repository;

import com.julscode.springecommerce.model.Orden;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdenRepository extends JpaRepository<Orden ,Integer> {

    
    
}
