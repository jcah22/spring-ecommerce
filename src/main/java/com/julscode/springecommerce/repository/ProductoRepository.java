package com.julscode.springecommerce.repository;

import com.julscode.springecommerce.model.Producto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Integer>{
    
}
