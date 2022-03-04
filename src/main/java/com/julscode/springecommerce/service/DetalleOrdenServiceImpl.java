package com.julscode.springecommerce.service;

import com.julscode.springecommerce.model.DetalleOrden;
import com.julscode.springecommerce.repository.DetalleaordenRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetalleOrdenServiceImpl implements DetalleOrdenService {

    @Autowired
    private DetalleaordenRepository detalleaordenRepository;

    @Override
    public DetalleOrden save(DetalleOrden detalleOrden) {
        
        return detalleaordenRepository.save(detalleOrden);
    }
    
}
